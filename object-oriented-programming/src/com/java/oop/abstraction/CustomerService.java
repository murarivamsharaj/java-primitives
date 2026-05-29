package com.java.oop.abstraction;

public  class CustomerService {

    void addCustomertoDb(Customer customer) {

    }

    void displayCustomerDetails(Customer customer)
    {
        System.out.println("id   : "+ customer.id);
        System.out.println("name :" + customer.name);
        System.out.println("email :" + customer.email);
        System.out.println("contctno:  " + customer.contactNo);
        System.out.println("salary :" + customer.salary);
        System.out.println("age" + customer.age);

    }

    // System.out.println("customer added to MySQL successfully");



}

