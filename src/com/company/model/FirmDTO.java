package com.company.model;

import com.company.ILanguage;

import java.util.List;

public class FirmDTO {

    private String name;
    private String phoneNumber;
    private String email;
    private String text;

    public FirmDTO() {}

    public FirmDTO(String name, String phoneNumber, String email, ILanguage language, List<UserDTO> users) {
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
