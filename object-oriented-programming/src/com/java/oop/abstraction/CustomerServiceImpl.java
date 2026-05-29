package com.java.oop.abstraction;

public class CustomerServiceImpl extends CustomerService {

    Repository repository;

    public CustomerServiceImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    void addCustomertoDb(Customer customer) {
        repository.connectToDb();
        repository.addCustomerTodb(customer);
    }
}
