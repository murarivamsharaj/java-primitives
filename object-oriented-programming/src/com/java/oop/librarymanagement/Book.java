package com.java.oop.librarymanagement;

class Book extends LibraryItem implements Borrowable {

    private boolean available = true;

    public Book(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: " + getTitle() +
                " | Author: " + getAuthor() +
                " | Available: " + available);
    }

    @Override
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(getTitle() + " borrowed successfully.");
        } else {
            System.out.println(getTitle() + " is already borrowed.");
        }
    }

    @Override
    public void returnBook() {
        available = true;
        System.out.println(getTitle() + " returned successfully.");
    }
}
