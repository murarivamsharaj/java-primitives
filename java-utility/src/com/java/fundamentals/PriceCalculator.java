package com.java.fundamentals;

import java.util.Scanner;

public class PriceCalculator {
    static void main() {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter product Price");
        int productPrice = sc.nextInt();
        System.out.println("Enter Menmership G S B ");
        char membership = sc.next().charAt(0);
        System.out.println("Enter age");
        int age = sc.nextInt();

        if ( membership == G)
            System.out.println(productPrice - productPrice + 0.10);


}
