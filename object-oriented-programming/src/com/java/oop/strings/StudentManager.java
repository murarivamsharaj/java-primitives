package com.java.oop.strings;

public class StudentManager {

    // ── STATIC MEMBERS ───────────────────────────────────────────
    static int studentCount = 0;                    // shared counter
    static final String SCHOOL_NAME = "Sunrise Academy"; // constant

    // ── INSTANCE FIELDS (Arrays & Strings) ───────────────────────
    String[] names  = new String[5];
    int[]    scores = new int[5];

    // ── METHOD 1: addStudent ──────────────────────────────────────
    void addStudent(String name, int score) {
        if (studentCount < names.length) {
            names[studentCount]  = name;
            scores[studentCount] = score;
            studentCount++;                         // update static counter
            System.out.println("Added: " + name.toUpperCase());
        } else {
            System.out.println("Roster full!");
        }
    }

    // ── METHOD 2: printAll ────────────────────────────────────────
    void printAll() {
        System.out.println("\n── " + SCHOOL_NAME + " ── Students ──");
        for (int i = 0; i < studentCount; i++) {
            String entry = (i + 1) + ". " + names[i] + " → Score: " + scores[i];
            System.out.println(entry);
        }
        System.out.println("Total students: " + studentCount);
    }

    // ── METHOD 3: findTopScorer ───────────────────────────────────
    String findTopScorer() {
        int topIndex = 0;
        for (int i = 1; i < studentCount; i++) {
            if (scores[i] > scores[topIndex]) {
                topIndex = i;
            }
        }
        return names[topIndex];
    }

    // ── METHOD 4: search (String operations) ─────────────────────
    void search(String keyword) {
        System.out.println("\nSearching for: \"" + keyword + "\"");
        for (int i = 0; i < studentCount; i++) {
            if (names[i].toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Found → " + names[i] +
                        " | Length: " + names[i].length() + " chars");
            }
        }
    }

    // ── MAIN METHOD (static entry point) ─────────────────────────
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();

        sm.addStudent("Arjun Sharma",  88);
        sm.addStudent("Priya Reddy",   95);
        sm.addStudent("Kiran Babu",    76);
        sm.addStudent("Divya Nair",    91);

        sm.printAll();

        String top = sm.findTopScorer();
        System.out.println("\nTop scorer: " + top.toUpperCase() + " 🏆");

        sm.search("a");
    }
}
