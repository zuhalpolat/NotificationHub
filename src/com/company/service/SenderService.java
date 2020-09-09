package com.company.service;

import com.company.exceptions.NullEmailException;
import com.company.exceptions.NullSmsException;
import com.company.interfaces.ISender;
import com.company.model.MessageDTO;

import java.util.List;

public class SenderService {

    public void sendNotification(MessageDTO messageDTO, List<ISender> senders) throws NullEmailException, NullSmsException {

        for(ISender sender: senders)
            sender.send(messageDTO);
    }
}
