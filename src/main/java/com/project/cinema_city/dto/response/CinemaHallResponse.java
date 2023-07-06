package com.project.cinema_city.dto.response;

import com.project.cinema_city.entity.Film;
import lombok.Data;


import java.util.Set;
@Data
public class CinemaHallResponse {
    private Long id;
    private Long numberOfHall;
    private Set<Film> films;
}
