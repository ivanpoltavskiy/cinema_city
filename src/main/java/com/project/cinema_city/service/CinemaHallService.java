package com.project.cinema_city.service;

import com.project.cinema_city.entity.CinemaHall;
import com.project.cinema_city.exception.CinemaHallNotFoundException;
import com.project.cinema_city.repository.CinemaHallRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CinemaHallService {
    private CinemaHallRepository cinemaHallRepository;

    public List<CinemaHall> cinemaHalls() {
        return cinemaHallRepository.findAll();
    }

    public CinemaHall findById(Long id) {
        return cinemaHallRepository.findById(id).orElseThrow(() -> new CinemaHallNotFoundException("Cinema Hall not found"));
    }

    public CinemaHall add(CinemaHall cinemaHall){
        return cinemaHallRepository.save(cinemaHall);
    }
    public CinemaHall update(CinemaHall cinemaHall){
        return cinemaHallRepository.save(cinemaHall);
    }
    public void delete(Long id){
        cinemaHallRepository.deleteById(id);
    }
}
