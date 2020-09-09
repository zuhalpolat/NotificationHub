package com.company.validator;

import com.company.exceptions.NullEmailException;
import com.company.interfaces.IValidator;
import com.company.model.MessageDTO;
import com.company.model.UserDTO;

public class EmailValidator  implements IValidator {

    @Override
    public boolean isValid(MessageDTO messageDTO) throws NullEmailException{
        for(UserDTO userDTO: messageDTO.getUsers())
        {
            if(userDTO.getEmail() == null)
                System.out.println(messageDTO.getFirm().getLanguage().nullEmail());
                throw  new NullEmailException(messageDTO.getFirm().getLanguage().nullEmail());
        }
        return !messageDTO.getFirm().getEmail().isEmpty();
    }
}
