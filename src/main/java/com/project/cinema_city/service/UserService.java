package com.project.cinema_city.service;

import com.project.cinema_city.entity.User;
import com.project.cinema_city.exception.UserNotFoundException;
import com.project.cinema_city.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;
    public List<User>users(){
        return userRepository.findAll();
    }
    public User findUserByEmail(String email){
        return userRepository.findUserByEmail(email).orElseThrow(()->new UserNotFoundException("User not found"));
    }
    public Boolean existUserByEmail(String email) {
        return userRepository.existsUserByEmail(email);
    }
}
