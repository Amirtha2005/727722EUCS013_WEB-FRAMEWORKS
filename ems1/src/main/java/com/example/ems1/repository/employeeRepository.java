package com.example.ems1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ems1.model.employeeModel;

public interface employeeRepository extends JpaRepository <employeeModel,Integer>{

}
