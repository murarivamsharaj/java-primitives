package com.java.practise.inheritance;

public class Hello {
    String name;

    static void main() {
        Hello hello = new Hello();
        Welcome welcome = new Welcome();
        hello.name = "BUnty";
        hello.displayName();
        welcome.name = "chintu";
        welcome.displayName();
    }

    void displayName() {
        System.out.println("What is his name :" + name);
    }
}
