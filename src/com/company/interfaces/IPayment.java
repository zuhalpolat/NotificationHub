package com.company.interfaces;

import com.company.model.FirmDTO;

import java.time.LocalDate;

public interface IPayment {

    void payPhoneBill(FirmDTO firmDTO, LocalDate date);
}
