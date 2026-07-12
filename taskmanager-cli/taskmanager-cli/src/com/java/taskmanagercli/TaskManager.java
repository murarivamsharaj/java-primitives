package com.java.taskmanagercli;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        System.out.println("=================================");
        System.out.println("   Welcome to Java Task Manager  ");
        System.out.println("=================================");

        while (running) {
            printMenu();
            System.out.print("\nChoose an option (1-4): ");

            String input = scanner.nextLine().trim();

            switch (input) {
                case "1":
                    viewTasks();
                    break;
                case "2":
                    addTask();
                    break;
                case "3":
                    completeTask();
                    break;
                case "4":
                    System.out.println("Exiting... Have a productive day!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n--- MAIN MENU ---");
        System.out.println("1. View Tasks");
        System.out.println("2. Add a Task");
        System.out.println("3. Mark Task as Done");
        System.out.println("4. Exit");
    }

    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("\nYour task list is currently empty.");
        } else {
            System.out.println("\n--- YOUR TASKS ---");
            for (int i = 0; i < tasks.size(); i++) {
                // Because Task is in the same folder, TaskManager can automatically use it
                System.out.println((i + 1) + ". " + tasks.get(i).toString());
            }
        }
    }

    private static void addTask() {
        System.out.print("\nEnter the task description: ");
        String desc = scanner.nextLine().trim();

        if (!desc.isEmpty()) {
            tasks.add(new Task(desc));
            System.out.println("Task added successfully!");
        } else {
            System.out.println("Task description cannot be empty.");
        }
    }

    private static void completeTask() {
        viewTasks();
        if (tasks.isEmpty()) return;

        System.out.print("\nEnter the number of the task to mark as done: ");
        try {
            int taskNum = Integer.parseInt(scanner.nextLine().trim());
            if (taskNum > 0 && taskNum <= tasks.size()) {
                tasks.get(taskNum - 1).markAsDone();
                System.out.println("Task #" + taskNum + " marked as completed!");
            } else {
                System.out.println("Invalid task number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        }
    }
}
