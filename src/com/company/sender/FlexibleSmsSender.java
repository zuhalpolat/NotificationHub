package com.company.sender;

import com.company.model.BlackList;
import com.company.exceptions.NullEmailException;
import com.company.exceptions.NullSmsException;
import com.company.interfaces.ISender;
import com.company.interfaces.IValidator;
import com.company.model.FirmDTO;
import com.company.model.MessageDTO;
import com.company.model.NotificationPackage;
import com.company.model.UserDTO;
import com.company.validator.SmsValidator;

import java.time.LocalDate;
import java.util.List;

public class FlexibleSmsSender extends NotificationPackage implements ISender {

    private IValidator validator;
    LocalDate currentDate = LocalDate.now();
    private double oneSmsPrice = 0.10;

    public FlexibleSmsSender(FirmDTO firmDTO) {
        super.setLimit(2000);
        super.setPrice(30.0);
        super.setStartDate(currentDate);
        super.setEndDate(currentDate.plusMonths(1));
        super.setSendNotification(0);
        validator = new SmsValidator();
        oneSmsPrice = 0.10;
        firmDTO.getBill().put(currentDate, getPrice());
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
    public LocalDate getStartDate() {
        return super.getStartDate();
    }

    @Override
    public void setStartDate(LocalDate startDate) {
        super.setStartDate(startDate);
    }

    @Override
    public LocalDate getEndDate() {
        return super.getEndDate();
    }

    @Override
    public void setEndDate(LocalDate endDate) {
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

    public double getOneSmsPrice() {
        return oneSmsPrice;
    }

    public void setOneSmsPrice(double oneSmsPrice) {
        this.oneSmsPrice = oneSmsPrice;
    }

    @Override
    public Integer getSendNotification() {
        return super.getSendNotification();
    }

    @Override
    public void setSendNotification(Integer sendNotification) {
        super.setSendNotification(sendNotification);
    }

    @Override
    public void increaseSendNotification() {
        super.increaseSendNotification();
    }

    @Override
    public void makeZeroSendNotification() {
        super.makeZeroSendNotification();
    }

    @Override
    public void send(MessageDTO messageDTO) throws NullEmailException, NullSmsException {
        isLimitExceed();
        isPackageValid(messageDTO);
        if (isValid(messageDTO)) {
            for (UserDTO userDTO : messageDTO.getUsers()) {
                System.out.println(messageDTO.getFirm().getName() +
                        " is sending this SMS: " + messageDTO.getText() +
                        "to " + userDTO.getName());
            }
            increaseSendNotification();
        }
    }

    public void isLimitExceed()
    {
        if(getSendNotification() >= getLimit())
            setPrice(getPrice() + oneSmsPrice);
    }

    public void isPackageValid(MessageDTO messageDTO)
    {
        LocalDate date = LocalDate.now();
        int diff = date.compareTo(getEndDate());

        if(diff > 0) {
            messageDTO.getFirm().getBill().put(currentDate, getPrice());
            setEndDate(currentDate.plusMonths(1));
        }
    }

    public boolean isValid(MessageDTO messageDTO) throws NullEmailException, NullSmsException {
        return validator.isValid(messageDTO) && !BlackList.getInstance().isInBlackList(messageDTO.getFirm());

    }
}
