package com.company.model;

import java.util.Date;
import java.util.List;

public class NotificationPackage
{
    private Integer limit;
    private Double price;
    private Date startDate;
    private Date endDate;
    private List<Integer> phoneBill;

    public NotificationPackage() {
    }

    public NotificationPackage(Integer limit, Double price, Date startDate, Date endDate, List<Integer> phoneBill) {
        this.limit = limit;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
        this.phoneBill = phoneBill;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Integer> getPhoneBill() {
        return phoneBill;
    }

    public void setPhoneBill(List<Integer> phoneBill) {
        this.phoneBill = phoneBill;
    }
}
