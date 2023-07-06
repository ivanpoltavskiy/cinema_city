package com.project.cinema_city.maper;

import com.project.cinema_city.dto.request.CinemaHallRequest;
import com.project.cinema_city.dto.response.CinemaHallResponse;
import com.project.cinema_city.entity.CinemaHall;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CinemaHallMapper {
    CinemaHallResponse toDto(CinemaHall entity);
    CinemaHall fromDto(CinemaHallRequest dto);
}
