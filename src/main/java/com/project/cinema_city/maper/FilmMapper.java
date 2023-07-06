package com.project.cinema_city.maper;

import com.project.cinema_city.dto.request.FilmRequest;
import com.project.cinema_city.dto.response.FilmResponse;
import com.project.cinema_city.entity.Film;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface FilmMapper {
    FilmResponse toDto(Film entity);
    Film fromDto(FilmRequest dto);
}
