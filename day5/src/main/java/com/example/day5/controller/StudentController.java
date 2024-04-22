package com.example.day5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/day5")
    public String day5(){
        return "changinggggg";
    }
}
