package com.project.cinema_city.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)

public class CinemaHallNotFoundException extends RuntimeException{
    public CinemaHallNotFoundException (String message){
        super(message);
    }
}
