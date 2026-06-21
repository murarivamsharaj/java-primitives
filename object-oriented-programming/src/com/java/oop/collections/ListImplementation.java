package com.java.oop.collections;

import java.util.ArrayList;

public class ListImplementation {
    static void main() {
        ArrayList<Customer> customerList = new ArrayList<>();

        Customer customer1 = new Customer();
        customer1.setId(2003);
        customer1.setName("Murari");
        customer1.setEmail("murari@gmail.com\n");

        Customer customer2 = new Customer();
        customer2.setId(2004);
        customer2.setName("Anil");
        customer2.setEmail("Anil @gmail.com\n");

        Customer customer3 = new Customer();
        customer3.setId(2005);
        customer3.setName("Sujith");
        customer3.setEmail("sujith@gmail.com");

        Customer customer4 = new Customer();
        customer4.setId(2005);
        customer4.setName("sujith");
        customer4.setEmail("sujith@gmail.com");

       customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        System.out.println(customerList);
        System.out.println(customerList.size());

        Customer firstCustomer = customerList.get(0);
        System.out.println(firstCustomer);
        for(Customer customer : customerList){
            System.out.println(customer);

        }
    }
}
