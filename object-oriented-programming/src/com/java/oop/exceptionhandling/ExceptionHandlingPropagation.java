package com.java.oop.exceptionhandling;

public class ExceptionHandlingPropagation {
    static void methodC() {
        int result = 10 / 0;
    }

    static void methodB() {
        try {
            methodC();
        } catch (ArithmeticException e) {
            System.out.println("Handled in methodB()");
        }
    }

    static void methodA() {
        methodB();
    }

    public static void main(String[] args) {
        methodA();
    }

}
