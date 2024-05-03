package com.example.payroll.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.payroll.model.employee;
import com.example.payroll.service.employeeService;

@RestController
public class employeeController {

    @Autowired
    private employeeService service;

    @PostMapping("/payrollservice")
    public ResponseEntity<employee> create(@RequestBody employee obj){
        employee e=service.create(obj);
        if(e!=null){
            return ResponseEntity.status(HttpStatus.CREATED).body(e);
        }
        else{
            return ResponseEntity.status(HttpStatus.valueOf(500)).build();
        }
    }

    @GetMapping("/display")
    public List<employee> display(){
        return service.display();
    }
}
