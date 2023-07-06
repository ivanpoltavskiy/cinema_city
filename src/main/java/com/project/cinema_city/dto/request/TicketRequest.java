package com.project.cinema_city.dto.request;

import com.project.cinema_city.entity.User;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class TicketRequest {
    @NotNull
    private Long id;
    private Integer number;
    private User user;

}
