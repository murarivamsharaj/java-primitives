package com.java.oop.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main() {
        try {
            Scanner sc = new Scanner(System.in);
            try{
            System.out.println("Enter a number");
            int numberOne = sc.nextInt();
            System.out.println("Enter a number");
            int numberTwo = sc.nextInt();
            System.out.println(numberOne / numberTwo);
        }catch (ArithmeticException e){
            System.out.println("Enter a valid number");
            input();
        }
    }
}

    private static void input() {
        System.out.println("continue inputs");
    }
    }

