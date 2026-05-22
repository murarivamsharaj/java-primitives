package com.java.assignment;

public class Product {
    int id;
    String name;
    String email;
    byte age;

    public Product(int id, String name, String email, byte age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    String getEmail(){
        return email;
    }
    byte getAge(){
        return age;
    }
    int setName(){

    }
}
