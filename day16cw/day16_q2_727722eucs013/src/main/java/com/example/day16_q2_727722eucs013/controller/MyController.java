package com.example.day16_q2_727722eucs013.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.day16_q2_727722eucs013.service.MyService;


@RestController
public class MyController {

    @Autowired
    public MyService myService;

    public void AppController(){
        myService.AppService();
    }

}
