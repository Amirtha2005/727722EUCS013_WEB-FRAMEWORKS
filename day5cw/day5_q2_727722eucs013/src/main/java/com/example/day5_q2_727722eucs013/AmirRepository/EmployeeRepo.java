package com.example.day5_q2_727722eucs013.AmirRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5_q2_727722eucs013.AmirModel.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
    
}

