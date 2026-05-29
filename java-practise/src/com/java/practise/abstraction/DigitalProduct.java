package com.java.practise.abstraction;

public class DigitalProduct extends Product implements Promotable{
    private String downloadLink;

    public DigitalProduct(String basePrice, double id, String downloadLink) {
        super(id, basePrice);
        this.downloadLink = downloadLink;
    }

    @Override
    public double calculateFinalPrice() {
        double discountedPrice = applyPromo(basePrice);
        return discountedPrice * 1.05;
    }

    @Override
    public double getDiscountRate() {
        return 0.25;
    }
}
