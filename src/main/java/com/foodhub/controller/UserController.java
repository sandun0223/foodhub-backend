package com.foodhub.backend.controller;

import com.foodhub.backend.entity.User;
import com.foodhub.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public User register(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}