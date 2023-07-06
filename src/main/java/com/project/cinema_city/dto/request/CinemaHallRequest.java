package com.project.cinema_city.dto.request;

import com.project.cinema_city.entity.Film;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CinemaHallRequest {
    @NotNull(message = "id cannot be null")
    private Long id;
    private Long numberOfHall;

}
