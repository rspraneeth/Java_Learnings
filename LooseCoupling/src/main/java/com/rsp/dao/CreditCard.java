package com.rsp.dao;

import com.rsp.service.IPay;

public class CreditCard implements IPay {
    public CreditCard() {
        System.out.println("Credit card is instantiated");
    }

    public boolean payBill(double amount){
        System.out.println("Payment is processed through CreditCard an amount paid is "+amount);
        return true;
    }
}
