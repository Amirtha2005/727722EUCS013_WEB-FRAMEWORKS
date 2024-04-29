package com.example.day14_q1_727722eucs013.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14_q1_727722eucs013.model.AmirEmployee;
import com.example.day14_q1_727722eucs013.repository.EmployeeRepo;

@Service

public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    public AmirEmployee addEmployee(AmirEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<AmirEmployee> getEmployees()
    {
        return employeeRepo.findAll();
    }

    public Optional<AmirEmployee> getEmployee(Long employeeId)
    {
        return employeeRepo.findById(employeeId);
    }

}
