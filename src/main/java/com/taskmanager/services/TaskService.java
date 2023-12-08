package com.taskmanager.services;

import com.taskmanager.DTO.TaskDTO;
import com.taskmanager.models.Task;
import com.taskmanager.models.TaskInfo;

import java.util.List;

public class TaskService{

    private final TaskDTO taskDTO;


    public TaskService(TaskDTO taskDTO) {
        this.taskDTO = taskDTO;
    }

    public Task findTaskById(long id) {
        return taskDTO.findById(id);
    }

    public List<Task> findAllTasks() {
        return taskDTO.findAll();
    }

    public Task createTask(TaskInfo info) {
        Task task = new Task(info);
        taskDTO.savaOrUpdate(task);
        return task;
    }

    public void updateTask(long id, TaskInfo info) {
        Task task = taskDTO.findById(id);

        task.setAssignee(info.getAssignee());
        task.setAuthor(info.getAuthor());
        task.setDescription(info.getDescription());
        task.setPriority(info.getPriority());
        task.setTitle(info.getTitle());
        task.setStatus(info.getStatus());

        taskDTO.savaOrUpdate(task);
    }

    public void deleteTaskById(long id) {
        taskDTO.deleteById(id);
    }
}
