package com.example.cc1practice1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cc1practice1.model.ccModel;

@RestController
public class ccController {

    
    private final ccModel u;

    @Autowired
    public ccController(ccModel u){
        this.u=u;

    }

    @GetMapping("/cc1")
    public String display(){
        return u.getName()+" "+ u.getVersion();
    }

}
