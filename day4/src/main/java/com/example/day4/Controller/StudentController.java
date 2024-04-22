package com.example.day4.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day4.Model.StudentModel;
import com.example.day4.Service.studentService;


@RestController

public class StudentController {
    
    @Autowired
    public studentService service;

    @GetMapping("/start")
    public String welcomString(){
        return "welcome all";
    }

    @PostMapping("/first")
    public String storing(@RequestBody List<StudentModel> obj){
        service.addInfo(obj);
        return "done";
    }

    @GetMapping("/display")
        public List<StudentModel> dis()
        {
           return service.display();
        }
    @GetMapping("/del")
    public List<StudentModel> del()
    {
        return service.delete(2);
    }
}
