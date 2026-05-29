package com.java.practise.polymorphisam;

public class Main {
    static void main() {
        Calculator c = new Calculator();
        System.out.println(c.add(10,20));
        System.out.println(c.add(10,20,30));
        System.out.println(c.add(10.5, 20.5));
    }
}
