package com.project.cinema_city.maper;

import com.project.cinema_city.dto.request.LoginRequest;
import com.project.cinema_city.dto.request.RegisterRequest;
import com.project.cinema_city.dto.response.UserResponse;
import com.project.cinema_city.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserResponse toDto(User entity);
    User fromDto(LoginRequest dto);
    User fromDto(RegisterRequest dto);
}
