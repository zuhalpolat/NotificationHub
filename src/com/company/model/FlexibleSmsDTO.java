package com.company.model;

import java.util.Date;
import java.util.List;

public class FlexibleSmsDTO extends NotificationPackage {

    public FlexibleSmsDTO() {
        super.setLimit(1000);
        super.setPrice(20.0);
        super.setStartDate(null);
        super.setEndDate(null);
    }

    @Override
    public List<Integer> getPhoneBill() {
        return super.getPhoneBill();
    }

    @Override
    public void setPhoneBill(List<Integer> phoneBill) {
        super.setPhoneBill(phoneBill);
    }

    @Override
    public Date getStartDate() {
        return super.getStartDate();
    }

    @Override
    public void setStartDate(Date startDate) {
        super.setStartDate(startDate);
    }

    @Override
    public Date getEndDate() {
        return super.getEndDate();
    }

    @Override
    public void setEndDate(Date endDate) {
        super.setEndDate(endDate);
    }

    @Override
    public Double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(Double price) {
        super.setPrice(price);
    }

    @Override
    public Integer getLimit() {
        return super.getLimit();
    }

    @Override
    public void setLimit(Integer limit) {
        super.setLimit(limit);
    }
}
