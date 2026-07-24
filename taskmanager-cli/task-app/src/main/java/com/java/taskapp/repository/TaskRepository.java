package com.java.taskapp.repository;

// 1. Ensure this imports Task, NOT TaskStatus
import com.java.taskapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
// 2. Ensure the brackets contain <Task, Long>
public interface TaskRepository extends MongoRepository<Task, String> {
}