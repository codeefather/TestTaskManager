package com.taskmanager.controllers;

import com.taskmanager.models.UserInfo;
import com.taskmanager.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping("/{id}")
//    public UserDTO getUserById(@PathVariable long id) {
//        return userService.findUserById(id);
//    }
//
//    @GetMapping
//    public List<UserDTO> getAllUsers() {
//        return userService.findAllUsers();
//    }

    @PostMapping
    public void createUser(UserInfo info) {
        userService.createUser(info);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable long id, @RequestBody UserInfo info) {
        userService.updateUser(id, info);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable long id) {
        userService.deleteUserById(id);
    }
}