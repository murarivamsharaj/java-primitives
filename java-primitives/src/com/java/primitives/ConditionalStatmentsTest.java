package com.java.primitives;

import java.util.Scanner;

public class ConditionalStatmentsTest {
    static void main() {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter two  numbers");
        int evenOdd = Sc.nextInt();
        int oddEven = Sc.nextInt();



        if (evenOdd > oddEven) {
            System.out.println("print even greater");
        } else if ( evenOdd < oddEven) {
            System.out.println("odd is greater ");
        } else {
            System.out.println(" Invalid no.");
        }
    }
}