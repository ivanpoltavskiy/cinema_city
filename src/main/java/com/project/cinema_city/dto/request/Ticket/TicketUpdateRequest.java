package com.project.cinema_city.dto.request.Ticket;

import com.project.cinema_city.entity.CinemaHall;
import com.project.cinema_city.entity.User;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class TicketUpdateRequest {
    @NotNull(message = "Id cannot be null")
    private Long id;
    @NotNull(message = "Name cannot be null")
    private Integer number;
    private User user;
    private CinemaHall hall;

}
