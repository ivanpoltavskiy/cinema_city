package com.project.cinema_city.controller;

import com.project.cinema_city.dto.request.CinenaHall.CinemaHallCreateRequest;
import com.project.cinema_city.dto.request.CinenaHall.CinemaHallUpdateRequest;
import com.project.cinema_city.dto.response.CinemaHallResponse;
import com.project.cinema_city.maper.CinemaHallMapperImpl;
import com.project.cinema_city.service.CinemaHallService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/cinemaHall")
public class CinemaHallController {
    private CinemaHallService cinemaHallService;
    private CinemaHallMapperImpl cinemaHallMapper;

    @GetMapping
    public List<CinemaHallResponse> getAll() {
        return cinemaHallService.cinemaHalls().stream().map(cinemaHallMapper::toDto).toList();
    }

    @GetMapping("/{id}")
    public CinemaHallResponse findById(@Valid @PathVariable Long id) {
        return cinemaHallMapper.toDto(cinemaHallService.findById(id));
    }

    @PostMapping("/add")
    public ResponseEntity<CinemaHallResponse> addCinemaHall(@Valid @RequestBody CinemaHallCreateRequest cinemaHall) {
        return new ResponseEntity<>(cinemaHallMapper.toDto(cinemaHallService.add(cinemaHallMapper.fromDto(cinemaHall))), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<CinemaHallResponse> updateCinemaHall(@Valid @RequestBody CinemaHallUpdateRequest cinemaHall) {
        return new ResponseEntity<>(cinemaHallMapper.toDto(cinemaHallService.update(cinemaHallMapper.fromDto(cinemaHall))), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        cinemaHallService.delete(id);
    }
}
