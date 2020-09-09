package com.company.model;

import com.company.interfaces.ILanguage;
import com.company.interfaces.ISender;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FirmDTO {

    private String name;
    private String phoneNumber;
    private String email;
    private ILanguage language;
    private List<ISender> sender = new ArrayList<>();
    private HashMap<LocalDate, Double> bill = new HashMap<>();

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

    public List<ISender> getSender() {
        return sender;
    }

    public void setSender(List<ISender> sender) {
        this.sender = sender;
    }

    public HashMap<LocalDate, Double> getBill() {
        return bill;
    }

    public void setBill(HashMap<LocalDate, Double> bill) {
        this.bill = bill;
    }
}
