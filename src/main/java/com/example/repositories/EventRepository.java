package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    // Adicione métodos personalizados aqui, se necessário
}