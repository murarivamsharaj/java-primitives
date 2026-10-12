package com.java.fundamentals;

import java.util.Scanner;

public class DataTypes {
    static void main() {

        int x = 55;
        int y = 7;
        int z = 8;
        int w = 9;

        int a = 10, b = 25, c = 15,d = 30;
            int largest;
            largest = (a > b) ? ((a > c) ? a : c)
                    : ((b > c) ? b : c);

        System.out.println("Largest: " + largest);

        char ch = 'A';

        String result = (ch >= 'A' && ch <= 'Z')
                ? "Uppercase"
                : "Not Uppercase";

        System.out.println(result);
    }
}
