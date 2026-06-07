package com.example.service.impl;

import com.example.dao.UserRepository;
import com.example.model.User;
import com.example.service.UserWebService;
import jakarta.jws.WebService;

import java.util.List;

@WebService(endpointInterface = "com.example.service.UserWebService")
public class UserWebServiceImpl implements UserWebService {

    private final UserRepository userRepository = new UserRepository();
    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public void updateUser(User user) {
        userRepository.update(user);
    }

    @Override
    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }
}
