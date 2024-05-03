package com.example.payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.payroll.model.employee;

public interface employeeRepo extends JpaRepository<employee,Integer>{

}
