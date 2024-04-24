package com.example.ems_tables.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ems_tables.model.employee;

public interface EmployeeInterface extends JpaRepository<employee,Integer>{

}
