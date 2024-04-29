package com.example.managertable.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.managertable.model.employeeTable;
import com.example.managertable.service.employeeService;

@RestController
public class employeeController {

    @Autowired
    private employeeService service1;

    //inserting values in employee table and salary
    @PostMapping("/insertEmployees")
    public String insertEmployees(@RequestBody employeeTable obj){

        service1.insertEmployees(obj);
        return "inserted";
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable int id){
        service1.deleteEmployee(id);
        return "deleted";
    }

    //patch up according to rating
    @PatchMapping("/updateEmployee/{id}")
    public String updateEmployee(@RequestBody employeeTable obj ,@PathVariable int id){

        service1.updateEmployee(obj,id);
        return "update";
    }

    //getting details by id
    @GetMapping("/getDetails/{id}")
    public ResponseEntity<employeeTable> getDetails(@PathVariable int id){
        employeeTable employee=service1.getDetails(id);
        return ResponseEntity.ok().body(employee);
    }

    //getting all employee details
    @GetMapping("/getAllEmployee")
    public ResponseEntity<List<Object[]>> getAllEmployees(){
        List<Object[]> employees=service1.getAllEmployees();
        return ResponseEntity.ok().body(employees);
    }
}
