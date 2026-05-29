package com.java.oop.exceptionhandling;

import java.util.Scanner;

public class Transaction {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a number :");
            int amountOne = scanner.nextInt();
            System.out.println("Enter another number :");
            int amountTwo = scanner.nextInt();
            int totalAmount = amountOne / amountTwo;
            System.out.println("what is the result value :" + totalAmount);
        } catch (ArithmeticException e) {
            System.out.println("invalid number ");
        }
    }
}