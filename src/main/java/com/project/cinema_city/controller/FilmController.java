package com.project.cinema_city.controller;

import com.project.cinema_city.dto.request.FilmRequest;
import com.project.cinema_city.dto.response.FilmResponse;
import com.project.cinema_city.maper.FilmMapperImpl;
import com.project.cinema_city.service.FilmService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/film")
public class FilmController {
    private FilmService filmService;
    private FilmMapperImpl filmMapper;

    @GetMapping
    public List<FilmResponse> getAll(){
        return filmService.getAll().stream().map(filmMapper::toDto).toList();
    }

    @GetMapping("/{id}")
    public FilmResponse findById(@Valid @PathVariable Long id){
        return filmMapper.toDto(filmService.findById(id));
    }
    @PostMapping("/add")
    public ResponseEntity <FilmResponse> addFilm(@Valid @RequestBody FilmRequest film){
        return new ResponseEntity<>(filmMapper.toDto(filmService.addFilm(filmMapper.fromDto(film))), HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<FilmResponse> updateFilm(@Valid @RequestBody FilmRequest film){
        return new ResponseEntity<>(filmMapper.toDto(filmService.updateFilm(filmMapper.fromDto(film))), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        filmService.deleteByID(id);
    }
}
