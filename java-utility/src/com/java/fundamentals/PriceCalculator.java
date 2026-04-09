package com.java.fundamentals;

import java.util.Scanner;

public class PriceCalculator {
    static void main() {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Price : ");
        int productPrice = sc.nextInt();
        System.out.println("Customer Membership (B,G,S,D): ");
        char membership = sc.next().charAt(0);
        System.out.println("Enter Age: ");
        byte age = sc.nextByte();
        System.out.println("Central Tax : ");
        int centralTax = sc.nextInt();
        System.out.println("State Tax : ");
        int stateTax = sc.nextInt();

        if (membership == 'B') {
            productPrice = (int) (productPrice - productPrice * 0.10);
        } else if (membership == 'S') {
            productPrice = (int) (productPrice - productPrice * 0.20);


        } else if (membership == 'G') {
            productPrice = (int) (productPrice - productPrice * 0.30);

        } else if (membership == 'D') {
            productPrice = (int) (productPrice - productPrice * 0.40);

        }
        if (age > 66) {
            productPrice = (int) (productPrice - productPrice * 0.25);
        } else if (age <= 65 && age > 45) {
            productPrice = (int) (productPrice - productPrice * 0.15);
        } else if (age <= 45 && age > 25) {
            productPrice = (int) (productPrice - productPrice * 0.05);


        }

        System.out.println(productPrice + centralTax + stateTax);

    }

}
