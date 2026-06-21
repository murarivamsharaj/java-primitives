package com.java.oop.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapImplementation {
    static void main() {

        //Map implementation
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

        Customer customer5 = new Customer();
        customer5.setId(2006);
        customer5.setName("Arisi");
        customer5.setEmail("Arisi@mail.com");

        HashMap<Integer, Customer> map = new HashMap<>();
        map.put(customer1.getId(), customer1);
        map.put(customer2.getId(), customer2);
        map.put(customer3.getId(), customer3);
        map.put(customer4.getId(), customer4);
        map.put(customer5.getId(), customer5);
        System.out.println("Map implementation :" + map);

        LinkedHashMap<Integer, Customer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(customer1.getId(), customer1);
        linkedHashMap.put(customer2.getId(), customer2);
        linkedHashMap.put(customer3.getId(), customer3);
        linkedHashMap.put(customer4.getId(), customer4);
        linkedHashMap.put(customer5.getId(), customer5);
        System.out.println("LinkedHashMap implementation :" + linkedHashMap);

        TreeMap<Integer, Customer> customerList = new TreeMap<>();
        customerList.put(2003, customer1);
        customerList.put(2004, customer2);
        customerList.put(2005, customer3);
        customerList.put(2005, customer4);
        customerList.put(2006, customer5);
        //  for (Customer customer : customerList.values()) {
        //    System.out.println(customer);
        System.out.println("customerList: " + customerList);
    }
}

