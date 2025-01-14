package com.example.entities;


import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<TouristAttraction> getAttractions() {
        return attractions;
    }

    public void setAttractions(Set<TouristAttraction> attractions) {
        this.attractions = attractions;
    }

    @ManyToMany(mappedBy = "categories")
    private Set<TouristAttraction> attractions;

    
}