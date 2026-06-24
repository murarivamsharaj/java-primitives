package com.java.oop.librarymanagement;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book("Java Programming", "James Gosling");
        Book b2 = new Book("Spring Boot Guide", "Rod Johnson");
        Book br = new Book("Frontend development ", "Murari");

        library.addBook(b1);
        library.addBook(b2);

        Student s1 = new Student(101, "Murari");

        library.showBooks();

        System.out.println("\n--- Borrow Operation ---");
        b1.borrowBook();

        System.out.println("\n--- Search Operation ---");
        s1.searchBook("Java Programming");
        s1.searchBook("Spring Boot Guide", "Rod Johnson");

        System.out.println("\n--- Runtime Polymorphism ---");
        LibraryItem item = new Book("Data Structures", "Mark Allen");
        item.displayInfo();

        System.out.println("\n--- Return Operation ---");
        b1.returnBook();

        library.showBooks();
    }
}
