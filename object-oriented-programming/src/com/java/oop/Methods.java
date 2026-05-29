package com.java.oop;

public class Methods {

    String name = "Murari";
    int maxRetailPrice = 23435;
    boolean availableStock = false;


    static void main() {
        Methods methods = new Methods();
        methods.displayProductDetails();
        int i = methods.multiplyNumbers(6,8);
        System.out.println("print i:" + i);
        methods.addNubers(45,55);
        methods.addNubers(103,97);
        methods.addNubers(145,155);
        methods.addNubers(200,200);
        methods.addNubers(250,250);

    }
    void displayProductDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("MRP: " + maxRetailPrice);
        System.out.println("Available Stock : " + availableStock);
    }
    int multiplyNumbers(int a,int b) {
        int x = a * b;
      return x;
    }
    void addNubers(int a,int b){
        System.out.println(a+b);

    }



}
