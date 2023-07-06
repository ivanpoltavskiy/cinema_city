package com.project.cinema_city.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameOfFilm;
    private String description;
    @ManyToOne
    private CinemaHall hall;
}
