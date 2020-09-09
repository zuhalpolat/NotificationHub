package com.company.service;

import com.company.interfaces.IPayment;
import com.company.model.FirmDTO;

import java.time.LocalDate;

public class PaymentService implements IPayment {
    @Override
    public void payPhoneBill(FirmDTO firmDTO, LocalDate date) {
        firmDTO.getBill().remove(date);
    }
}
