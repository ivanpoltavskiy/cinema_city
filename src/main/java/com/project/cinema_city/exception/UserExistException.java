package com.project.cinema_city.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class UserExistException extends RuntimeException{
    public UserExistException(String message){
        super(message);
    }
}
