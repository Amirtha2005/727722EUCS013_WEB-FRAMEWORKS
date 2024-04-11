package com.example.day2_q2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day2_q2.model.Student;

@RestController
public class StudentController {

    @GetMapping("/students")
    public Student display(){
        
        Student obj=new Student();
        obj.setName("Nithish");
        obj.setAge(22);

        return obj;
    }
}
