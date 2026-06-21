package com.java.oop.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsStudyGuide {

    public static void main(String[] args) {
        // 1. Set up our data source
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Engineering", 85000),
                new Employee("Bob", "HR", 60000),
                new Employee("Charlie", "Engineering", 95000),
                new Employee("Diana", "Marketing", 75000),
                new Employee(null, "Engineering", 85000),
                new Employee("Eve", "Engineering", 110000),
                new Employee("Fred", "Marketing", 120000),
                new Employee(null, "Bob", 90000),
                new Employee(null, "Charlie", 120000),
                new Employee(null, "Diana", 90000),
                new Employee(null, "Charlie", 120000)
                );

        System.out.println("--- 1. FILTER (Intermediate Operation) ---");
        // Goal: Find all employees in the Engineering department
        List<Employee> engineers = employees.stream()
                .filter(emp -> emp.getDepartment().equals("Engineering"))
                .collect(Collectors.toList());
        engineers.forEach(System.out::println);

        System.out.println("\n--- 2. MAP (Intermediate Operation) ---");
        // Goal: Extract just the names of all employees and convert them to uppercase
        List<String> upperCaseNames = employees.stream()
                .map(emp -> emp.getName().toUpperCase())
                .collect(Collectors.toList());
        System.out.println(upperCaseNames);

        System.out.println("\n--- 3. SORTED (Intermediate Operation) ---");
        // Goal: Sort employees by salary in descending order
        List<Employee> sortedBySalary = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        sortedBySalary.forEach(System.out::println);

        System.out.println("\n--- 4. CHAINING (Combining Multiple Operations) ---");
        // Goal: Get the names of Engineers making over $90,000, sorted alphabetically
        List<String> highPaidEngineers = employees.stream()
                .filter(emp -> emp.getDepartment().equals("Engineering")) // Keep only Engineers
                .filter(emp -> emp.getSalary() > 90000)                   // Keep salary > 90k
                .map(Employee::getName)                                   // Extract just the name
                .sorted()                                                 // Sort alphabetically
                .collect(Collectors.toList());                            // Gather into a list
        System.out.println("High-paid engineers: " + highPaidEngineers);

        System.out.println("\n--- 5. REDUCE (Terminal Operation) ---");
        // Goal: Calculate the total salary of all employees
        double totalSalary = employees.stream()
                .map(Employee::getSalary)
                .reduce(0.0, (subtotal, element) -> subtotal + element);
        System.out.println("Total Salary Payroll: $" + totalSalary);

        System.out.println("\n--- 6. MATCHING & FINDING (Terminal Operations) ---");
        // Goal: Check if anyone makes over $100k, and find the first HR person
        boolean hasHighEarner = employees.stream()
                .anyMatch(emp -> emp.getSalary() > 100000);
        System.out.println("Anyone making > $100k? " + hasHighEarner);

        Optional<Employee> firstHR = employees.stream()
                .filter(emp -> emp.getDepartment().equals("HR"))
                .findFirst();
        // Using ifPresent to safely print the Optional value
        firstHR.ifPresent(emp -> System.out.println("First HR Employee found: " + emp.getName()));
    }
}
