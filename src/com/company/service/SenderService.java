package com.company.service;

import com.company.intfcs.ISender;
import com.company.model.FirmDTO;

import java.util.List;

public class SenderService {

    public void sendNotification(FirmDTO firmDTO, List<ISender> senders){

        for(ISender sender: senders) sender.send(firmDTO);
    }
}
