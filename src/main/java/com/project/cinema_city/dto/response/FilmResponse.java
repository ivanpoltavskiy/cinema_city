package com.project.cinema_city.dto.response;

import com.project.cinema_city.entity.CinemaHall;
import lombok.Data;

import javax.persistence.ManyToOne;
@Data
public class FilmResponse {
    private Long id;
    private String nameOfFilm;
    private String description;
    private CinemaHall hall;
}
