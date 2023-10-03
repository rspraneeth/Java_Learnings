package com.rsp.main;

import com.rsp.dao.CreditCard;
import com.rsp.dao.DebitCard;
import com.rsp.dao.QRCode;
import com.rsp.service.PaymentProcess;

import java.util.Scanner;

public class LaunchMain {
    public static void main(String[] args) {

        //PaymentProcess pp = new PaymentProcess();
        System.out.println("Choose payment method, 1 CC, 2 DC, 3 QR: ");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();
        if (option==1) {
            //setter injection
            //pp.setPay(new CreditCard());
            PaymentProcess pp = new PaymentProcess(new CreditCard()); //constructor injection
            pp.doPayment(100);
        }
        else if (option==2) {
            //pp.setPay(new DebitCard());
            PaymentProcess pp = new PaymentProcess(new DebitCard());
            pp.doPayment(200);
        }
        else if (option==3) {
            //pp.setPay(new QRCode());
            PaymentProcess pp = new PaymentProcess(new QRCode());
            pp.doPayment(100);
        }
        else System.out.println("Choose again among 1/2/3");
        //System.out.println(pp.doPayment(100));
    }
}
