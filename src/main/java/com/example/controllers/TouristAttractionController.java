package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.entities.TouristAttraction;
import com.example.services.TouristAttractionService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/attractions")
public class TouristAttractionController {

    @Autowired
    private TouristAttractionService attractionService;

    // Retorna todas as atrações turísticas
    @GetMapping
    public List<TouristAttraction> getAllAttractions() {
        return attractionService.getAllAttractions();
    }

    // Busca uma atração pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<TouristAttraction> getAttractionById(@PathVariable Long id) {
        Optional<TouristAttraction> attraction = attractionService.getAttractionById(id);
        return attraction.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Adiciona uma nova atração
    @PostMapping
    public TouristAttraction createAttraction(@RequestBody TouristAttraction attraction) {
        return attractionService.saveAttraction(attraction);
    }

    // Atualiza uma atração existente
    @PutMapping("/{id}")
    public ResponseEntity<TouristAttraction> updateAttraction(@PathVariable Long id, @RequestBody TouristAttraction attraction) {
        if (!attractionService.getAttractionById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        attraction.setId(id);
        return ResponseEntity.ok(attractionService.saveAttraction(attraction));
    }

    // Remove uma atração
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAttraction(@PathVariable Long id) {
        if (!attractionService.getAttractionById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        attractionService.deleteAttraction(id);
        return ResponseEntity.noContent().build();
    }
}