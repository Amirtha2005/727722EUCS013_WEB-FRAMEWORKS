package com.example.payroll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.payroll.model.employee;
import com.example.payroll.repository.employeeRepo;

@Service
public class employeeService {

    @Autowired
    private employeeRepo repo;

    public employee create(employee obj){
        return repo.save(obj);
    }

    public List<employee> display(){
        return repo.findAll();
    }
}
