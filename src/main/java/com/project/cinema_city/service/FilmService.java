package com.project.cinema_city.service;

import com.project.cinema_city.entity.Film;
import com.project.cinema_city.exception.FilmNotFoundException;
import com.project.cinema_city.repository.FilmRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class FilmService {
    public FilmRepository filmRepository;

    public List<Film> getAll() {
        return filmRepository.findAll();
    }

    public Film findById(Long id) {
        return filmRepository.findById(id).orElseThrow(() -> new FilmNotFoundException("Film not found"));
    }

    public Film addFilm(Film film) {
        return filmRepository.save(film);
    }

    public Film updateFilm(Film film) {
        return filmRepository.save(film);
    }

    public void deleteByID(Long id ){filmRepository.deleteById(id);}
}
