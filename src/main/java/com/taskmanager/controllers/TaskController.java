package com.taskmanager.controllers;

import com.taskmanager.models.TaskInfo;
import com.taskmanager.services.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

//    @GetMapping("/{id}")
//    public TaskDTO getTaskById(@PathVariable long id) {
//        return taskService.findTaskById(id);
//    }
//
//    @GetMapping
//    public List<TaskDTO> getAllTasks() {
//        return taskService.findAllTasks();
//    }

    @PostMapping
    public void createTask(TaskInfo info) {
        taskService.createTask(info);
    }

    @PutMapping("/{id}")
    public void updateTask(@PathVariable long id, TaskInfo info) {
        taskService.updateTask(id, info);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable long id) {
        taskService.deleteTaskById(id);
    }
}