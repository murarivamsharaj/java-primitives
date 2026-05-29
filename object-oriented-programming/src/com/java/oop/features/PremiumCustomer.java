package com.java.oop.features;

public class PremiumCustomer extends Customer{
    String membership;

    public PremiumCustomer(int id, String name, String email, long contactNo, byte age, int salary, String membership) {
        super(id, name, email, contactNo, age, salary);
        this.membership = membership;
    }
    void displayCustomerDetails(){
        System.out.println("Membership details: " + membership);
    }
}
