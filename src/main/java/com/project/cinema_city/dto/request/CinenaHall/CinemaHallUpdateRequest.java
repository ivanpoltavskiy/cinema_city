package com.project.cinema_city.dto.request.CinenaHall;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class CinemaHallUpdateRequest {
    @NotNull(message = "id cannot be null")
    private Long id;
    private Long numberOfHall;

}
