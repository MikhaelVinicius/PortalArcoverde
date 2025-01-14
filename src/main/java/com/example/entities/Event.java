package com.example.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private String location;
    private Double ticketPrice;
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "attraction_id")
    private TouristAttraction touristAttraction;

}
