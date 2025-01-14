package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.TouristAttraction;
import com.example.repositories.TouristAttractionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TouristAttractionService {

    @Autowired
    private TouristAttractionRepository touristAttractionRepository;

    // Retorna todas as atrações turísticas
    public List<TouristAttraction> getAllAttractions() {
        return touristAttractionRepository.findAll();
    }

    // Busca uma atração pelo ID
    public Optional<TouristAttraction> getAttractionById(Long id) {
        return touristAttractionRepository.findById(id);
    }

    // Adiciona ou atualiza uma atração
    public TouristAttraction saveAttraction(TouristAttraction attraction) {
        return touristAttractionRepository.save(attraction);
    }

    // Remove uma atração pelo ID
    public void deleteAttraction(Long id) {
        touristAttractionRepository.deleteById(id);
    }
}