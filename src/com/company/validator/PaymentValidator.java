package com.company.validator;

import com.company.model.BlackList;
import com.company.model.FirmDTO;

import java.time.LocalDate;
import java.util.Map;

public class PaymentValidator {

    int unpaidBill;
    LocalDate currentDate = LocalDate.now();

    public void controlBill(FirmDTO firmDTO)
    {
        for(Map.Entry<LocalDate, Double> set : firmDTO.getBill().entrySet()) {
            int diff = currentDate.compareTo(set.getKey());

            if (diff > 2) {
                BlackList.getInstance().addBlackList(firmDTO);
                return;
            }
        }
    }
}
