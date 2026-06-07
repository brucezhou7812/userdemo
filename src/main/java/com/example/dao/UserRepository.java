package com.example.dao;

import com.example.model.User;
import com.example.utils.JPAUtils;
import jakarta.persistence.EntityManager;

import java.util.List;

public class UserRepository {
    private final String getAllUsersQuery = "SELECT u FROM User u";
    public UserRepository() {
        // Constructor
    }

    public void save(User user) {
        // Code to save user to the database
        try (EntityManager em = JPAUtils.getEntityManager()) {
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        }
    }

    public User findById(int id) {
        // Code to find user by ID
        try (EntityManager em = JPAUtils.getEntityManager()) {
            User user = em.find(User.class, id);
            System.out.println("User found: " + user);
            return user;
        }
    }

    public void update(User user) {
        // Code to update user in the database
        try (EntityManager em = JPAUtils.getEntityManager()) {
            em.getTransaction().begin();
            em.merge(user);
            em.getTransaction().commit();
        }
    }

    public void deleteById(int id) {
        // Code to delete user by ID
        try (EntityManager em = JPAUtils.getEntityManager()) {
            em.getTransaction().begin();
            User user = em.find(User.class, id);
            if(user != null) {
                em.remove(user);
            }
            em.getTransaction().commit();
        }
    }

    public List<User> getAllUsers() {
        // Code to get all users from the database
        try (EntityManager em = JPAUtils.getEntityManager()) {
            return em.createQuery(getAllUsersQuery, User.class).getResultList();
        }
    }
}
