package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Category;
import com.example.repositories.CategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    // Retorna todas as categorias
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    // Busca uma categoria pelo ID
    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    // Adiciona ou atualiza uma categoria
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    // Remove uma categoria pelo ID
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}