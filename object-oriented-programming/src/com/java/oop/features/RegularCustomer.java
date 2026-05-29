package com.java.oop.features;

public class RegularCustomer extends Customer {
    int cashBackPoints;

    public RegularCustomer(int id, String name, String email, long contactNo, byte age, int salary, int cashBackPoints) {
        super(id, name, email, contactNo, age, salary);
        this.cashBackPoints = cashBackPoints;
    }

    public RegularCustomer() {
        super();
        System.out.println("Regular customer called:");
    }

    void displayCustomerDetails() {
        super.displayCustomerDetails();
        System.out.println("cash Back points: " + cashBackPoints);
    }
}

