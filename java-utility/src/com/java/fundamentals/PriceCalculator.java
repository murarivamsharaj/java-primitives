package com.java.fundamentals;


import java.util.Scanner;

public class PriceCalculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price of the product : -");
        double productPrice = sc.nextDouble();
        System.out.println("Membership (G ,S, B, P :-");
        char memberShip = sc.next().charAt(0);
        System.out.println("Enter Age :-");
        int age = sc.nextInt();
        System.out.println("Enter central Tax :-");
        int centralTax = sc.nextInt();
        System.out.println("Enter state Tax :-");
        int stateTax = sc.nextInt();

        //applying Membership discount
        if (memberShip == 'G') {
            productPrice = productPrice - productPrice * 0.40;
        } else if (memberShip == 'S') {
            productPrice = productPrice - productPrice * 0.30;
        } else if (memberShip == 'B') {
            productPrice = productPrice - productPrice * 0.20;
        } else if (memberShip == 'P') {
            productPrice = productPrice - productPrice * 0.10;
        }

        //apply age disocunt
        if (age >= 90) {
            productPrice = productPrice - productPrice * 0.25;
        } else if (age > 60) {
            productPrice = productPrice - productPrice * 0.20;
        } else if (age > 40) {
            productPrice = productPrice - productPrice * 0.15;
        } else if (age > 20) {
            productPrice = productPrice - productPrice * 0.10;
        } else if (age > 15) {
            productPrice -= productPrice * 0.5;
        }
        double finalValue = productPrice + centralTax + stateTax;
        System.out.println(" The Final Value of the Product is= :" + (productPrice + centralTax + stateTax));
    }
}