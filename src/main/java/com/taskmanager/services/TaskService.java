package com.taskmanager.services;

import com.taskmanager.interfaces.TaskRepository;
import com.taskmanager.models.Task;

import java.util.List;

public class TaskService{
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task findTaskById(long id) {
        return taskRepository.findById(id);
    }

    public List<Task> findAllTasks() {
        return taskRepository.findAll();
    }

    public void createTask(Task task) {
        taskRepository.save(task);
    }

    public void updateTask(Task task) {
        taskRepository.update(task);
    }

    public void deleteTaskById(long id) {
        taskRepository.deleteById(id);
    }
}
