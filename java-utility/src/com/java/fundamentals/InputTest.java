package com.java.fundamentals;

import java.util.Scanner;

public class InputTest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rollno : ");
        byte rollno = sc.nextByte();
        System.out.println("rollno = " + rollno);

        System.out.println("Enter Marks");
        short marks = sc.nextShort();
        System.out.println("Enter marks =" + marks);

        System.out.println("Enter Mobile no. : "   );
        long mobileno = sc.nextLong();
        System.out.println("mobile no " + mobileno);

        System.out.println("Enter your grade");
        char grade = sc.next().charAt(0);
        System.out.println("enter grade :" + grade );

        System.out.println("Is available in stock true/false");
        boolean isstock = sc.nextBoolean();
        System.out.println("the available stock is : " + isstock);

        System.out.println("Enter discount value");
        float discountPercentage = sc.nextFloat();
        System.out.println("the discount value is" + discountPercentage);

        System.out.println("Enter value of present bank balance");
        double bankbalance = sc.nextDouble();
        System.out.println("Available bank balance:" + bankbalance);

        sc.close();



    }
}
