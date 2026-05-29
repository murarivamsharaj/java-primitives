package com.java.practise.polymorphisam;

public class GooglePay extends Payment{
    @Override
    void pay(){
        System.out.println("Payment done using Google Pay");
    }
}
