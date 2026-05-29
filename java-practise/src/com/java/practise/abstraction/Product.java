package com.java.practise.abstraction;

public abstract class Product {
    protected String id;
    protected double basePrice;

    public Product(double basePrice, String id) {
        this.basePrice = basePrice;
        this.id = id;
    }
    public void displayInfo(){
        System.out.println("Product ID: %s | Base Price: $%.2f%n" + id + basePrice);
    }
    public abstract double calculateFinalPrice();
    }

