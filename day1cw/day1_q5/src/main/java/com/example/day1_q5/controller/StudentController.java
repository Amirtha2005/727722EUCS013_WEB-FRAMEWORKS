package com.example.day1_q5.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day1_q5.model.Student;


@RestController
public class StudentController {
    
    @GetMapping("/student")
    public List<Student> getStudents(){
        List<Student> students=new ArrayList<>();
        Student obj=new Student();
        obj.setStudentName("John");
        obj.setMessage("Welcome, John!");
        students.add(obj);
        return students;
    }
}
