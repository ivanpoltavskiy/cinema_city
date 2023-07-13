package com.project.cinema_city.controller;

import com.project.cinema_city.dto.response.UserResponse;
import com.project.cinema_city.maper.UserMapperImpl;
import com.project.cinema_city.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
    private UserService userService;
    private UserMapperImpl userMapper;

    @GetMapping
    public List<UserResponse> users(){
        return userService.users().stream().map(userMapper::toDto).toList();
    }
}