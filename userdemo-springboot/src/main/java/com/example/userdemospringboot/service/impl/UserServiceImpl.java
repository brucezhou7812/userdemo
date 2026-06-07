package com.example.userdemospringboot.service.impl;

import com.example.userdemospringboot.dao.UserRepository;
import com.example.userdemospringboot.model.User;
import com.example.userdemospringboot.service.UserSerice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserSerice {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(User user) {
        this.userRepository.save(user);
    }

    @Override
    public User getUserById(Integer id) {
        return this.userRepository.getReferenceById(id);
    }

    @Override
    public void updateUser(User user) {
        this.userRepository.save(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        this.userRepository.deleteById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }
}
