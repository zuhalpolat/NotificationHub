package com.company;

import com.company.exceptions.NullEmailException;
import com.company.exceptions.NullSmsException;
import com.company.model.*;
import com.company.language.Turkish;
import com.company.sender.FixedEmailSender;
import com.company.sender.FixedSmsSender;
import com.company.sender.FlexibleEmailSender;
import com.company.sender.FlexibleSmsSender;
import com.company.service.SenderService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws NullEmailException, NullSmsException {

        UserDTO user1 = new UserDTO("a", "b", null, "d");
        UserDTO user2 = new UserDTO("e", "f", "g", "h");

        List<UserDTO> userDTOS = new ArrayList<>();
        userDTOS.add(user1);
        userDTOS.add(user2);

        FirmDTO firm1 = new FirmDTO();
        firm1.setEmail("kodluyoruz@gmail.com");
        firm1.setName("Kodluyoruz");
        firm1.setPhoneNumber("05398745632");
        firm1.setLanguage(new Turkish());
        firm1.getSender().add(new FixedEmailSender(firm1));
        firm1.getSender().add(new FixedSmsSender(firm1));
        firm1.getSender().add(new FlexibleEmailSender(firm1));
        firm1.getSender().add(new FlexibleSmsSender(firm1));

        MessageDTO messageDTO = new MessageDTO();
        messageDTO.setUsers(userDTOS);
        messageDTO.setFirm(firm1);
        messageDTO.setText("Merhaba");

        SenderService senderService = new SenderService();
        senderService.sendNotification(messageDTO, firm1.getSender());

        System.out.println(firm1.getBill());
    }
}
