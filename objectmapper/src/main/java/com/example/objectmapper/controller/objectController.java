package com.example.objectmapper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.objectmapper.model.objectModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class objectController {

    @Autowired
    objectModel m= new objectModel();
    @GetMapping("/wel")
    public String wel()
    {
        return "welcome";
    }
    @GetMapping("/mapper")
    public objectModel mapper()
    {
        m.setName("Amir");
        m.setPassword("123456");
        return m;
    }
    @GetMapping("/map")
    public String map() throws JsonProcessingException
    {
        ObjectMapper obj= new ObjectMapper();
        obj.writeValueAsString(m.getPassword());
        return  m.getPassword();
    }
}