package com.example.ems_tables.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.ems_tables.model.employee;

import jakarta.transaction.Transactional;

public interface EmployeeInterface extends JpaRepository<employee,Integer>{

    // List<employee> findById(int emp_id);

    // @Transactional
    // @Modifying
    // @Query("select from employee e where e.employee_id = :emp_id")  
    // void getByEmpId(int emp_id);

    @Transactional
    @Modifying
    @Query("select e from employee e")
    public List<employee> getAllEmployee();
}
