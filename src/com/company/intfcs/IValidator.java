package com.company.intfcs;

import com.company.model.EmailDTO;
import com.company.model.FirmDTO;
import com.company.model.SmsDTO;

public interface IValidator {

    boolean isValid(FirmDTO firmDTO, SmsDTO smsDTO);

    boolean isValid(FirmDTO firmDTO, EmailDTO emailDTO);
}
