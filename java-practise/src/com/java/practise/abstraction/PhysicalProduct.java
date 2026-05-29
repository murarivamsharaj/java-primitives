package com.java.practise.abstraction;

public class PhysicalProduct extends Product implements Shippable, Promotable{
    private double weight;

    public PhysicalProduct(String basePrice, double id, double weight) {
        super(id, basePrice);
        this.weight = weight;
    }

    @Override
    public double calculateFinalPrice() {
        double discountedPrice = applyPromo(basePrice);
        double shippingCost = weight * 2.5;
        return discountedPrice + shippingCost;
    }

    @Override
    public double getDiscountRate() {
        return 0;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public String getShippingProvider() {
        return "";
    }
}
