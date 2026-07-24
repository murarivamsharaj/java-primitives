package com.java.taskapp.controller;

import com.java.taskapp.dto.TaskRequestDto;
import com.java.taskapp.dto.TaskResponseDto;
import com.java.taskapp.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor
public class TaskController {

    // Capitalized the 'S' to follow standard Java naming conventions
    private final TaskService taskService;

    @PostMapping
    public TaskResponseDto createTask(@RequestBody TaskRequestDto requestDto) {
        // Removed the null masking variables so it uses the injected service
        return taskService.createTask(requestDto);
    }

    @GetMapping
    public List<TaskResponseDto> getAllTasks() { // Added the generic type
        return taskService.getAllTasks();
    }
}