package com.java.oop.librarymanagement;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("\n------ Library Books ------");
        for (Book book : books) {
            book.displayInfo();
        }
    }
}

