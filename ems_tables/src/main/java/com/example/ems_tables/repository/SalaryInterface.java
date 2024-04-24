package com.example.ems_tables.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ems_tables.model.salary;

public interface SalaryInterface extends JpaRepository<salary,Integer>{

}
