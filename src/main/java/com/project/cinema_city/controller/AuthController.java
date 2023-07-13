package com.project.cinema_city.controller;

import com.project.cinema_city.dto.request.Auth.LoginRequest;
import com.project.cinema_city.dto.request.Auth.RegisterRequest;
import com.project.cinema_city.dto.response.UserResponse;
import com.project.cinema_city.maper.UserMapperImpl;
import com.project.cinema_city.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;
    private final UserMapperImpl userMapper;
    @PostMapping("/register")
    public ResponseEntity<UserResponse> register (@Valid @RequestBody RegisterRequest register){
        return new ResponseEntity<>(userMapper.toDto(authService.register(userMapper.fromDto(register))), HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<Void> login(@Valid @RequestBody LoginRequest login){
        authService.login(userMapper.fromDto(login));
        return ResponseEntity.ok().build();
    }
}
