package com.java.maven.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    private int id;
    private String name;
    private String company;
    private String model;
    private double maxRetailPrice;
    private int manufactureYear;
    private float maxDiscountPercentage;

    private StockAvailability stockAvailability;


}
