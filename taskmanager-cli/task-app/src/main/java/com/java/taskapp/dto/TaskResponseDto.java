package com.java.taskapp.dto;

import com.java.taskapp.enums.TaskStatus; // Added standard import

// Removed the <TaskStatus> generic parameter
public record TaskResponseDto(Long id, String title, TaskStatus status) {
}