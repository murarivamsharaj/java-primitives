package com.java.maven;

import com.java.maven.model.Product;
import com.java.maven.model.StockAvailability;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {


        Product product = Product.builder()
                .id(1)
                .name("iphone")
                .company("Apple")
                .model("pro")
                .manufactureYear(2026)
                .maxRetailPrice(69999.99)
                .maxDiscountPercentage(20.1F)
                .stockAvailability(StockAvailability.AVAILABLE)
                .build();

        System.out.println(product);
    }

}
