package com.example.day1_q1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/welcome")
    public String greeting(){
        return "Welcome Spring Boot!";
    }
}
