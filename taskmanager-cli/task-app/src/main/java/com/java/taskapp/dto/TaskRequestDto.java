package com.java.taskapp.dto;

import com.java.taskapp.enums.TaskStatus; // Added standard import

// Removed the <TaskStatus> generic parameter
public record TaskRequestDto(String title, TaskStatus status) {
}