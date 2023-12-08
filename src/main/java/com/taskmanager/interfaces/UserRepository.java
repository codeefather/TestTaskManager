package com.taskmanager.interfaces;

import com.taskmanager.models.User;

import java.util.List;

public interface UserRepository {
    User findById(long id);

    List<User> findAll();

    void save(User user);

    void update(User user);

    void deleteById(long id);
}
