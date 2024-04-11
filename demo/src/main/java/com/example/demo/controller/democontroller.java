package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class democontroller {

    @GetMapping("/welcome")
    public String greeting(){
        return "Welcome all";
    }

    @GetMapping("/destroy")
    public String destroy(){
        return "Destroyed Information";
    }
}
