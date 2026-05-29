package com.java.oop;

public class Order {
    int orderId;
    long orderOtp;
    String orderDay;
    boolean isPersonAvailable;

    public Order(int orderId, long orderOtp, String orderDay, boolean isPersonAvailable) {
        this.orderId = orderId;
        this.orderOtp = orderOtp;
        this.orderDay = orderDay;
        this.isPersonAvailable = isPersonAvailable;
    }

    public Order(){

    }
}
