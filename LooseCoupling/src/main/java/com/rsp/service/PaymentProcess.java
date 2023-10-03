package com.rsp.service;

import com.rsp.dao.*;

public class PaymentProcess {
    //composition

    private IPay pay;

    public PaymentProcess(IPay pay) {
        super();
        this.pay=pay;
    }

    //setter injection
    public void setPay(IPay pay) {
        this.pay = pay;
    }

    public boolean doPayment(double amount){
//        DebitCard dc = new DebitCard();
//        dc.payBill(amount);
//
//        CreditCard cc = new CreditCard();
//        cc.payBill(amount);
//
//        QRCode qr = new QRCode();
//        qr.payBill(amount);

        //got tightly coupled

        boolean status = pay.payBill(amount);
        if (status) System.out.println("Payment success");
        else System.out.println("Payment failed");

        return true;
    }
}
