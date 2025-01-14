package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.User;
import com.example.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Retorna todos os usuários
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Busca um usuário pelo ID
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Busca um usuário pelo email
    public Optional<User> getUserByEmail(String email) {
        return Optional.ofNullable(userRepository.findByEmail(email));
    }

    // Adiciona ou atualiza um usuário
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Remove um usuário pelo ID
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
