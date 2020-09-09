package com.company.model;

import java.util.List;

public class MessageDTO {

    private List<UserDTO> users;
    private FirmDTO firm;
    private String text;

    public MessageDTO() {
    }

    public MessageDTO(List<UserDTO> users, FirmDTO firm, String text) {
        this.users = users;
        this.firm = firm;
        this.text = text;
    }

    public List<UserDTO> getUsers() {
        return users;
    }

    public void setUsers(List<UserDTO> users) {
        this.users = users;
    }

    public FirmDTO getFirm() {
        return firm;
    }

    public void setFirm(FirmDTO firm) {
        this.firm = firm;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
