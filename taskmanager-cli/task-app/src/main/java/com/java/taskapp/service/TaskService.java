package com.java.taskapp.service;

import com.java.taskapp.dto.TaskRequestDto;
import com.java.taskapp.dto.TaskResponseDto;
import com.java.taskapp.enums.TaskStatus; // Added the missing import
import com.java.taskapp.model.Task;
import com.java.taskapp.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskResponseDto createTask(TaskRequestDto requestDto) {
        // Cleaned up the unnecessary casting
        Task task = new Task(null, requestDto.title(), requestDto.status());

        Task savedTask = taskRepository.save(task);

        return new TaskResponseDto(savedTask.getId(), savedTask.getTitle(), savedTask.getStatus());
    }

    public List<TaskResponseDto> getAllTasks() { // Added the generic type
        return taskRepository.findAll()
                .stream()
                .map(task -> new TaskResponseDto(task.getId(), task.getTitle(), task.getStatus()))
                .collect(Collectors.toList());
    }
}