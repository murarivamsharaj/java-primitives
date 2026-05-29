package com.java.oop.abstraction;

public class Main {
    static void main() {
        Customer customer1 = new Customer(9786, "deepak", "deepak@gmail.com", 857859L, (byte) 78, 35378);
        Customer customer2 = new Customer(7886, "Anil", "Anil@gmail.com", 346529859L, (byte) 78, 35378);
       /* CustomerService customerService = new CustomerService();
        customerService.addCustomertoDb(customer1);*/
        MySQLRepository repository = new MySQLRepository();
        PostGreSql postGreSql = new PostGreSql();
        CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl(postGreSql);
        customerServiceImpl.addCustomertoDb(customer1);
        customerServiceImpl.displayCustomerDetails(customer1);
    }

}
