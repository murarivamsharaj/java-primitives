package com.java.oop.abstraction;

public class MySQLRepository implements Repository{

    @Override
    public void connectToDb() {
        System.out.println("connect to MYSQL database successfully");
    }

    @Override
    public void addCustomerTodb(Customer customer) {
        System.out.println("adding customer to MYSQL database successfully");
    }
}
