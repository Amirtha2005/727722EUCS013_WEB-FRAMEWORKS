package com.example.day11_q1_727722eucs013.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.day11_q1_727722eucs013.model.Amir;
import com.example.day11_q1_727722eucs013.service.StudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class StudentController {
    public StudentService studentService;
    public StudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }
    
    @PostMapping("/api/student")
    public Amir postMethodName(@RequestBody Amir student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<Amir> getMethodName() {
        return studentService.getStudents();
    }
    
}
