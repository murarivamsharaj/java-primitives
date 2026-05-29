package com.java.oop.assignment;

import java.util.List;

public class ProductService {

    private List<Product> products;
    private CsvReader csvReader;

    public ProductService(CsvReader csvReader) {
        this.csvReader = csvReader;
        products = this.csvReader.getProductsFromCsv();
    }

    // GET ALL PRODUCTS
    public List<Product> getAllProducts() {
        return products;
    }

    // ADD PRODUCT
    public Product addProduct(Product product) {
        products.add(product);
        return product;
    }

    // GET PRODUCT BY ID
    public Product getProductById(int id) {

        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }

        return null;
    }

    // UPDATE PRODUCT
    public Product updateProduct(Product product) {

        int index = 0;

        for (Product p : products) {

            if (p.getId() == product.getId()) {
                products.set(index, product);
                return product;
            }

            index++;
        }

        return null;
    }
}