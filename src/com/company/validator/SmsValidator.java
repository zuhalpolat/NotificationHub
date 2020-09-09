package com.company.validator;

import com.company.exceptions.NullSmsException;
import com.company.interfaces.IValidator;
import com.company.model.MessageDTO;
import com.company.model.UserDTO;

public class SmsValidator implements IValidator {

    @Override
    public boolean isValid(MessageDTO messageDTO) throws NullSmsException {
        for(UserDTO userDTO: messageDTO.getUsers())
        {
            if(userDTO.getPhoneNumber() == null)
                throw  new NullSmsException(messageDTO.getFirm().getLanguage().nullSms());
        }
        return !messageDTO.getFirm().getPhoneNumber().isEmpty();
    }
}
