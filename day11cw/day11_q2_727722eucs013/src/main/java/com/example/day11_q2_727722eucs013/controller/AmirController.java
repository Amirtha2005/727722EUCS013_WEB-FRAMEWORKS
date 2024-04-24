package com.example.day11_q2_727722eucs013.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.day11_q2_727722eucs013.model.Amir;
import com.example.day11_q2_727722eucs013.model.AmirInfo;
import com.example.day11_q2_727722eucs013.service.AmirService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class AmirController {
    public AmirService studentService;
    public AmirController(AmirService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public Amir postMethodName(@RequestBody Amir student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public AmirInfo postMethodName(@RequestBody AmirInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<Amir> getMethodName() {
        return studentService.getStudents();
    }
    
}