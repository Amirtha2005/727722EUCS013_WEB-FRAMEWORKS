package com.example.day15_q4_727722eucs013.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day15_q4_727722eucs013.model.Employee;


public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
