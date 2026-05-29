package com.java.oop;

import java.util.Arrays;

public class ArrayCodingQuetions {


    public static int findingHighestPrice(int[] productPrices) {
        int highestPrice = productPrices[0];
        for (int i = 1; i < productPrices.length; i++) {
            if (productPrices[i] > highestPrice) {
                highestPrice = productPrices[i];
            }
        }
        return highestPrice;
    }

    public static void printAscending(int[] productPrices) {
        Arrays.sort(productPrices);

        System.out.print("Prices in Ascending  Order: ");
        for (int price : productPrices) System.out.print(price + " ");
        System.out.println();
    }

    static void main(String[] args) {

        int[] productPrices = {50, 10, 40, 20, 30};


        int highest = findingHighestPrice(productPrices);
        System.out.println("Highest Price: " + highest);

        printAscending(productPrices);
    }
}