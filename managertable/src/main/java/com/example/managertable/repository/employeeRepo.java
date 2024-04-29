package com.example.managertable.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.managertable.model.employeeTable;

public interface employeeRepo extends JpaRepository<employeeTable, Integer>{

    @Query("SELECT e.id, e.name FROM employeeTable e")
    List<Object[]> findAllByIdandName();
}
