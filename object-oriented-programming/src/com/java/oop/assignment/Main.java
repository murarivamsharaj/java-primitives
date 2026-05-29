package com.java.oop.assignment;

public class Main {

    public static void main(String[] args) {

        CsvReader csvReader = new CsvReader();

        ProductService productService =
                new ProductService(csvReader);

        // DISPLAY ALL PRODUCTS
        System.out.println(productService.getAllProducts());

        // CREATE NEW PRODUCT
        Product product = new Product();

        product.setId(51);
        product.setName("Samsung  TV");
        product.setMaxRetailPrice(32432);
        product.setDiscountPercentage(10);
        product.setAvailable(true);
        product.setCompany("Samsung ");
        product.setCategory("TV");
        product.setManufacturedYear(2023);

        // ADD PRODUCT
        productService.addProduct(product);

        // DISPLAY PRODUCTS AGAIN
        System.out.println(productService.getAllProducts());
    }
}