package com.example.customproperties.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customproperties.model.customModel;

@RestController
public class customController {

    @Autowired
    private customModel cus;

    @GetMapping("/custom")
    public String cus()
    {
        System.out.print( cus.getName());
        return cus.getName();
    }
}