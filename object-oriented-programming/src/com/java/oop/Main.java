package com.java.oop;

public class Main {
    static void main() {
        Product product = new Product();
        product.id = 9702;
        product.name = "Centrino Loafer for Men | Stylish & Comfortable with Soft Cushioned Insole | Hand-Stitched Design for Trendy   ";
        product.reviewsCount = 82;
        product.isAvailable = true;
        product.company = "Centrino";
        product.category = "Footware";
        product.ratings = 3.3F;
        product.maxRetailPrice = 749;
        product.discountPercentage = -70;

        System.out.println("id =" + product.id);
        System.out.println("name =" + product.name);
        System.out.println("reviewscount =" + product.reviewsCount);
        System.out.println("isAvailable =" + product.isAvailable);
        System.out.println("company =" + product.company);
        System.out.println("category =" + product.category);
        System.out.println("ratings =" + product.ratings);
        System.out.println("max retail price =" + product.maxRetailPrice);
        System.out.println("Discount percentage = " + product.discountPercentage);
        System.out.println("\n");

        Product product2 = new Product();
        product2.id = 47;
        product2.name = "Bata Men's Lace-up Sneaker";
        product2.reviewsCount = 2272;
        product2.isAvailable = true;
        product2.company = "Bata";
        product2.category = "Footware";
        product2.ratings = 4.1F;
        product2.maxRetailPrice = 1359;
        product2.discountPercentage = -20;

        System.out.println("id =" + product2.id);
        System.out.println("name =" + product2.name);
        System.out.println("reviewscount =" + product2.reviewsCount);
        System.out.println("isAvailable =" + product2.isAvailable);
        System.out.println("company =" + product2.company);
        System.out.println("category =" + product2.category);
        System.out.println("ratings =" + product2.ratings);
        System.out.println("max retail price =" + product2.maxRetailPrice);
        System.out.println("Discount percentage = " + product2.discountPercentage);
    }
}
