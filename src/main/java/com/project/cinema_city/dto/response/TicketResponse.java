package com.project.cinema_city.dto.response;

import com.project.cinema_city.entity.CinemaHall;
import com.project.cinema_city.entity.Film;
import com.project.cinema_city.entity.User;
import lombok.Data;
import java.util.Set;

@Data
public class TicketResponse {
    private Long id;
    private Integer number;
    private Film film;
    private CinemaHall hall;
    private User user;
}
