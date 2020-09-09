package com.company.model;

import com.company.intfcs.ILanguage;

import java.util.List;

public class FirmDTO {

    private String name;
    private String phoneNumber;
    private String email;
    private ILanguage language;

    public FirmDTO() {}

    public FirmDTO(String name, String phoneNumber, String email, ILanguage language) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ILanguage getLanguage() {
        return language;
    }

    public void setLanguage(ILanguage language) {
        this.language = language;
    }

}
