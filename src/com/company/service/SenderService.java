package com.company.service;

import com.company.ISender;
import com.company.model.FirmDTO;
import com.company.model.UserDTO;

import java.util.List;

public class SenderService {

    public void sendNotification(FirmDTO firmDTO, List<ISender> senders){

        for(ISender sender: senders) sender.send(firmDTO);
    }
}
