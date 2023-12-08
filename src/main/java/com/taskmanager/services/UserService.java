package com.taskmanager.services;

import com.taskmanager.DTO.UserDTO;
import com.taskmanager.models.User;
import com.taskmanager.models.UserInfo;

import java.util.List;

public class UserService {

//    private UserRepository userRepository;

//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    private final UserDTO userDTO;

    public UserService(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

//    public User findUserById(long id) {
//        return userRepository.findById(id);
//    }
//
//    public List<User> findAllUsers() {
//        return userRepository.findAll();
//    }

    public User createUser(UserInfo info) {
        User user = new User(info);
        userDTO.savaOrUpdate(user);
        return user;
    }
    public void updateUser(long id, UserInfo info) {
        User user = userDTO.findById(id);

        user.setEmail(info.getEmail());
        user.setName(info.getName());
        user.setRole(info.getRole());

        userDTO.savaOrUpdate(user);
    }
    public void deleteUserById(long id) {
        userDTO.deleteById(id);
    }
}
