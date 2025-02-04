package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.TouristAttraction;

@Repository
public interface TouristAttractionRepository extends JpaRepository<TouristAttraction, Long> {
    // Adicione métodos personalizados aqui, se necessário
}