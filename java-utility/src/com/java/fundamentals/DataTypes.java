package com.java.fundamentals;

import java.util.Scanner;

public class DataTypes {
    static void main() {
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of customers :");
        int customers = sc.nextInt();
        System.out.println("Enter the number of items :");
        int items = sc.nextInt();*/
        int x = 55;
        int y = 7;
        int z = 8;

//        if (x > y) {
//            System.out.println(x);
//        } else if (y > z) {
//            System.out.println(y);
//        }else if (z > x && x > z) {
//            System.out.println(z);
//        }
//        int n = 5;
//        int result = 10;
//
//        result = n%2==0 ?10:20;
//        System.out.println(result);

        int a = 10, b = 25, c = 15;
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
