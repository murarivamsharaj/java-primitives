package com.java.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

    private int id;
    private String name;
    private String brand;
    private int price;
    private int manufactureYear;
    private int manufactureMonth;
    private int manufactureDay;

}

