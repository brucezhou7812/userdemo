package com.example.service;

import com.example.model.User;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public interface UserWebService {
    @WebMethod
    void createUser(User user);

    @WebMethod
    User getUserById(int id);

    @WebMethod
    void updateUser(User user);

    @WebMethod
    void deleteUserById(int id);

    @WebMethod
    List<User> getAllUsers();
}
