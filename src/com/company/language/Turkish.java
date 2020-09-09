package com.company.language;

import com.company.interfaces.ILanguage;

public class Turkish implements ILanguage {

    @Override
    public String nullSms() {
        return "Telefon numarası boş!";
    }

    @Override
    public String nullEmail() {
        return "Mail bilgisi boş!";
    }
}
