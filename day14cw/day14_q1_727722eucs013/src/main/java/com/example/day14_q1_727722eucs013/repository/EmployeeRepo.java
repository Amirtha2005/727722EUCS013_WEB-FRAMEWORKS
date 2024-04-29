package com.example.day14_q1_727722eucs013.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day14_q1_727722eucs013.model.AmirEmployee;


@Repository
public interface EmployeeRepo extends JpaRepository<AmirEmployee,Long> {
    
}
