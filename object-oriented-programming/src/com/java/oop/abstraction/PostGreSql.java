package com.java.oop.abstraction;

public class PostGreSql implements Repository{

    @Override
    public void connectToDb() {
        System.out.println("connect to POSTGRESQL database successfully");
    }

    @Override
    public void addCustomerTodb(Customer customer) {
        System.out.println("adding customer to POSTGRESQL database successfully");
    }
}
