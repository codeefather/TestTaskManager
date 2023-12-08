package com.taskmanager.interfaces;

import com.taskmanager.models.Task;

import java.util.List;

public interface TaskRepository {
    Task findById(long id);

    List<Task> findAll();

    void save(Task task);

    void update(Task task);

    void deleteById(long id);
}
