package com.example.userdemospringboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.userdemospringboot.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
