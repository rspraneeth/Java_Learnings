package com.rsp.dao;

import com.rsp.service.IPay;

public class QRCode implements IPay {
    public QRCode() {
        System.out.println("QRCode is instantiated");
    }

    public boolean payBill(double amount){
        System.out.println("Payment is processed through QRCode an amount paid is "+amount);
        return true;
    }
}
