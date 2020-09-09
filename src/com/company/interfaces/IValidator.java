package com.company.interfaces;

import com.company.exceptions.NullEmailException;
import com.company.exceptions.NullSmsException;
import com.company.model.MessageDTO;

public interface IValidator {
    boolean isValid(MessageDTO messageDTO) throws NullEmailException, NullSmsException;
}
