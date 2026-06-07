package com.example.userdemospringboot.controller;

import com.example.userdemospringboot.model.User;
import com.example.userdemospringboot.service.UserSerice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    private final UserSerice userSerice;

    public UserController(UserSerice userSerice) {
        this.userSerice = userSerice;
     }

    @PostMapping("/create")
    public void createUser(@RequestBody User user) {
        userSerice.createUser(user);
    }

    @PostMapping("/update")
    public void updateUser(@RequestBody User user) {
        userSerice.updateUser(user);
    }

    @GetMapping("/getById/{id}")
    public User getUserById(@PathVariable("id") Integer id) {
        return userSerice.getUserById(id);
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return userSerice.getAllUsers();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUserById(@PathVariable("id") Integer id) {
        userSerice.deleteUserById(id);
    }
}
