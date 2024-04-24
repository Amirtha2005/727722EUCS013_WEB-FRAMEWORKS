package com.example.ems_tables.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ems_tables.model.department;

public interface DepartmentInterface extends JpaRepository<department,Integer>{

}
