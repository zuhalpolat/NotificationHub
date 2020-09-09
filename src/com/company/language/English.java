package com.company.language;

import com.company.interfaces.ILanguage;

public class English implements ILanguage {

    @Override
    public String nullSms() {
        return "Phone number information is null!";
    }

    @Override
    public String nullEmail() {
        return "Mail information is null!";
    }

}
