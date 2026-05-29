package com.java.practise.polymorphisam;

public class PhonePe extends Payment{
    @Override
    void pay(){
        System.out.println("Payment done by PhonePe");
    }
}
