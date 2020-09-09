package com.company.model;

import java.time.LocalDate;
import java.util.List;

public class NotificationPackage
{
    private Integer limit;
    private Double price;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<Integer> phoneBill;
    private Integer sendNotification = 0;

    public NotificationPackage() {
    }

    public NotificationPackage(Integer limit, Double price, LocalDate startDate, LocalDate endDate, List<Integer> phoneBill, Integer sendNotification) {
        this.limit = limit;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
        this.phoneBill = phoneBill;
        this.sendNotification = sendNotification;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<Integer> getPhoneBill() {
        return phoneBill;
    }

    public void setPhoneBill(List<Integer> phoneBill) {
        this.phoneBill = phoneBill;
    }

    public Integer getSendNotification() {
        return sendNotification;
    }

    public void setSendNotification(Integer sendNotification) {
        this.sendNotification = sendNotification;
    }

    public void increaseSendNotification() {
        this.sendNotification++;
    }

    public void makeZeroSendNotification() {
        this.sendNotification = 0;
    }
}
