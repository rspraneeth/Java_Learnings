package com.rsp.dao;

import com.rsp.service.IPay;

public class DebitCard implements IPay {
    public DebitCard() {
        System.out.println("Debit card is instantiated");
    }

    public boolean payBill(double amount){
        System.out.println("Payment is processed through DebitCard an amount paid is "+amount);
        return true;
    }
}
