package com.java.practise.polymorphisam;

public class PaymentMain {
    static void main() {
        Payment pay;
        pay = new PhonePe();
        pay.pay();
        pay = new GooglePay();
        pay.pay();

    }
}
