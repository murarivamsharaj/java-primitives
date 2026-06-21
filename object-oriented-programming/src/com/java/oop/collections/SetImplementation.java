package com.java.oop.collections;


import java.util.HashSet;
import java.util.TreeSet;

public class SetImplementation {
    static void main() {

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
        customer4.setName("ABCD");
        customer4.setEmail("sujith@gmail.com");

        System.out.println(customer1);


      /*  TreeSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("C");
        set.add("F");
        set.add("B");
        set.add("D");
        System.out.println(set.size());
        for (String str : set) {
            System.out.println(str);
        }*/
      TreeSet<Customer> customerSet = new TreeSet<>();
      customerSet.add(customer1);
      customerSet.add(customer2);
      customerSet.add(customer3);
      customerSet.add(customer4);
        System.out.println(customerSet);
        System.out.println(customerSet.size());

    }
}