package com.project.cinema_city.dto.request.Film;

import com.project.cinema_city.entity.CinemaHall;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class FilmUpdateRequest {
    @NotNull(message = "Id cannot be null")
    private Long id;
    @NotNull(message = "Name cannot be null")
    private String nameOfFilm;
    private String description;
    private CinemaHall hall;
}
