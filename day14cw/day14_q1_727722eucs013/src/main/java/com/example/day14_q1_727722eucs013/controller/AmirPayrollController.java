package com.example.day14_q1_727722eucs013.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14_q1_727722eucs013.model.AmirPayroll;
import com.example.day14_q1_727722eucs013.service.PayrollService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class AmirPayrollController {
    @Autowired
    private PayrollService PayrollService;

    @PutMapping("/employee/{employeeId}/payroll")
    public AmirPayroll addPayroll(@PathVariable Long employeeId,@RequestBody AmirPayroll payroll) {
        return PayrollService.addPayroll(employeeId,payroll);
    }

    @GetMapping("/employee/{employeeId}/payroll")
    public Optional<AmirPayroll> getMethodName(@PathVariable Long employeeId) {
        return PayrollService.getPayroll(employeeId);
    }
    
    
}
