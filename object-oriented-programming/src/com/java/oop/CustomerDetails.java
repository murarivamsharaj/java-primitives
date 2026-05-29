package com.java.oop;

public class CustomerDetails {
    int id;
    String name;
    long contactNo;
    byte age;
    boolean isActive;
    String address;
    String email;

    public CustomerDetails(int id, String name, long contactNo, byte age, boolean isActive, String address, String email) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.age = age;
        this.isActive = isActive;
        this.address = address;
        this.email = email;
    }

    CustomerDetails(){

    }
}
