package com.example.managertable.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.managertable.model.salaryTable;

public interface salaryRepo extends JpaRepository<salaryTable, Integer>{

}
