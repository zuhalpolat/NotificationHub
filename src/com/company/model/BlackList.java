package com.company.model;

import com.company.validator.PaymentValidator;

import java.util.ArrayList;
import java.util.List;

public class BlackList {

    private static BlackList mInstance;
    private List<FirmDTO> blackList = null;

    public static BlackList getInstance() {
        if(mInstance == null)
            mInstance = new BlackList();

        return mInstance;
    }

    private BlackList() {
        blackList = new ArrayList<FirmDTO>();
    }

    public void addBlackList(FirmDTO firmDTO) {
        blackList.add(firmDTO);
    }

    public void removeBlackList(FirmDTO firmDTO){
        blackList.remove(firmDTO);
    }

    public List<FirmDTO> getBlackList() {
        return blackList;
    }

    public boolean isInBlackList(FirmDTO firmDTO){

        PaymentValidator paymentValidator = new PaymentValidator();
        paymentValidator.controlBill(firmDTO);
        return blackList.contains(firmDTO);
    }
}
