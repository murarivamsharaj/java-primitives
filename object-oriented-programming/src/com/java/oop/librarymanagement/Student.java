package com.java.oop.librarymanagement;

class Student {
    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    // Method Overloading
    public void searchBook(String title) {
        System.out.println("Searching book by title: " + title);
    }

    public void searchBook(String title, String author) {
        System.out.println("Searching book: " + title +
                " by " + author);
    }
}
