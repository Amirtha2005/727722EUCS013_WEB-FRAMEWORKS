package com.example.day2_q3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day2_q3.model.Student;


@RestController
public class StudentController {
    @GetMapping("/student")
    public Student getstudent(){
        Student obj = new Student();
        obj.setId("1L");
        obj.setName("John Doe");
        obj.setDescription("This is a student description");

        return obj;
    }
}
