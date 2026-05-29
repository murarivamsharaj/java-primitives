package com.java.oop;

public class ShippingPartner {
    String deliveryPartner;
    boolean isdelivering;
    long partnerNo;
    String deliveryDay;

    public ShippingPartner(String deliveryPartner, boolean isdelivering, long partnerNo, String deliveryDay) {
        this.deliveryPartner = deliveryPartner;
        this.isdelivering = isdelivering;
        this.partnerNo = partnerNo;
        this.deliveryDay = deliveryDay;
    }

    public ShippingPartner(){

    }
}


