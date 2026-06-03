package com.java.oop.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            try {
                System.out.println("Enter first number:");
                int numberOne = sc.nextInt();

                System.out.println("Enter second number:");
                int numberTwo = sc.nextInt();

                System.out.println("Result: " + (numberOne / numberTwo));

            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero.");
                input();
            } catch (InputMismatchException e) {
                System.out.println("Please enter valid integers.");
                input();
            }

            try {
                int[] ids = new int[10];
                ids[30] = 100;

            } catch (ArrayIndexOutOfBoundsException | NegativeArraySizeException e) {
                System.out.println("Some issues in arrays.");
                input();
            }

            try {
                String username = getUserName();
                System.out.println(username.equals("Murari"));

            } catch (NullPointerException e) {
                System.out.println("Some null pointer issues.");
            }

        } catch (Exception e) {
            System.out.println("Some internal error occurred. Please try again later.");
            System.out.println("Reason: " + e.getMessage());
        }
    }

    private static String getUserName() {
        return null;
    }

    private static void input() {
        System.out.println("Continue inputs...");
    }
}