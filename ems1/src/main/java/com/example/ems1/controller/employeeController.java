package com.example.ems1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ems1.model.employeeModel;
import com.example.ems1.service.employeeService;

@RestController
public class employeeController {

    @Autowired
    public employeeService service;

    @GetMapping("/ems")
    public String welcome(){
        return "Welcome";
    }

    @PostMapping("/first")
    public String storing(@RequestBody List<employeeModel> obj){
        service.addInfo(obj);
        return "done";
    }

    @GetMapping("/display")
    public List<employeeModel> dis(){
        return service.display();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id){
        service.delete(id);   
        return "Data id: "+id+ " is deleted";
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable long id, @RequestBody List<employeeModel> obj){
        service.update(id,obj);
        return "updated";
    }
}
