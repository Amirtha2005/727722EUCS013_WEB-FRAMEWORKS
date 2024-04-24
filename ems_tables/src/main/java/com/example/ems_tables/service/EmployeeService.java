package com.example.ems_tables.service;

import org.springframework.stereotype.Service;

import com.example.ems_tables.model.employee;
import com.example.ems_tables.repository.EmployeeInterface;

@Service
public class EmployeeService {

    private EmployeeInterface repo2;

    public EmployeeService(EmployeeInterface repo2) {
        this.repo2 = repo2;
    }

    public void addInfo2(employee obj2){
        repo2.save(obj2);
    }
}
