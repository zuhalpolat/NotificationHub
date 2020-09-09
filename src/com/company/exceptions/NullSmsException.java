package com.company.exceptions;

import com.company.model.MessageDTO;

public class NullSmsException extends Exception{

    public NullSmsException(String  message) {
        super(message);
    }
}
