package com.java.oop.abstraction;

public class Customer {
    int id;
    String name;
    String email;
    long contactNo;
    byte age;
    int salary;
    char  gender;

    public Customer() {
        System.out.println("customer() is called");
    }

    public Customer(int id, String name, String email, long contactNo, byte age, int salary,  char gender) {
        System.out.println("customer() with argument called");
        this.id = id;
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
        this.age = age;
        this.salary = salary;
        this.gender = gender;

    }
}