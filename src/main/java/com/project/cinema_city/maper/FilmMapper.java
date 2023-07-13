package com.project.cinema_city.maper;

import com.project.cinema_city.dto.request.Film.FilmCreateRequest;
import com.project.cinema_city.dto.request.Film.FilmUpdateRequest;
import com.project.cinema_city.dto.response.FilmResponse;
import com.project.cinema_city.entity.Film;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface FilmMapper {
    FilmResponse toDto(Film entity);
    Film fromDto(FilmCreateRequest dto);
    Film fromDto(FilmUpdateRequest dto);
}
