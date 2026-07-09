package com.java.fundamentals;

public class ForTest {
    static void main() {
    //for loop
        int a = 1;
        int b = 2;
        int c = 3;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                for (int k = 1; k <= c; k++) {
                    System.out.print(j + " ");
                }
            }
        }

    }
}
