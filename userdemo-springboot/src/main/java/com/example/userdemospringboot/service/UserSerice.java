package com.example.userdemospringboot.service;

import com.example.userdemospringboot.model.User;

import java.util.List;

public interface UserSerice {
    void createUser(User user);
    User getUserById(Integer id);
    void updateUser(User user);
    void deleteUserById(Integer id);
    List<User> getAllUsers();
}
