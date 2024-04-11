package com.example.day2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day2.model.user;

@RestController
public class ApiController {

    private final user u;

    @Autowired
    public ApiController(user u){
        this.u=u;
    }

    @GetMapping("/first")
    public String greet(){
        return u.getName();
    }

}
