package com.example.entities;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class TouristAttraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String location;
    private Double latitude;
    private Double longitude;
    private String imageUrl;
    private Double rating;

    @ManyToMany
    @JoinTable(
        name = "attraction_category",
        joinColumns = @JoinColumn(name = "attraction_id"),
        inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Set<Category> categories;

    
}
