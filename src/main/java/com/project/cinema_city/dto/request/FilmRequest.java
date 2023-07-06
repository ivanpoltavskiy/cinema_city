package com.project.cinema_city.dto.request;

import com.project.cinema_city.entity.CinemaHall;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class FilmRequest {

    private Long id;
    @NotNull(message = "Name cannot be null")
    private String nameOfFilm;
    private String description;
    private CinemaHall hall;
}
