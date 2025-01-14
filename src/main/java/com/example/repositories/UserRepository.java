package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Método para buscar usuário por email
    User findByEmail(String email);
}