package com.java.oop.features;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Customer customer1 = new Customer(9786,"deepak","deepak@gmail.com",857859L,(byte) 78,35378);
        //  customer.id = 21;
        //customer.displayCustomerDetails();

        // Customer customer1 = new Customer(22,"Murari","Murari@gmail.com",8679869L, (byte) 32,67869);
        RegularCustomer regularCustomer = new RegularCustomer(22, "Murari", "Murari@gmail.com", 8679869L, (byte) 32, 67869, 576);
        RegularCustomer regularCustomer1 = new RegularCustomer(44,"Suresh", "suresh@gmail.com", 875678969L,(byte) 78,96998,456);
        // regularCustomer.displayCustomerDetails();

        PremiumCustomer premiumCustomer = new PremiumCustomer(33, "Anil", "anil@gmail.com", 342983598L, (byte) 54, 34535, "Gold");
        //premiumCustomer.displayCustomerDetails();
        CustomerService customerService = new CustomerService();
        customerService.displayCustomerDetails(customer1);
        customerService.displayCustomerDetails(regularCustomer);
    }
}


