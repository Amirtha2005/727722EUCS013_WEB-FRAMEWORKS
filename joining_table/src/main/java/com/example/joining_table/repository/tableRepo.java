package com.example.joining_table.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.joining_table.model.tableone;

public interface tableRepo extends JpaRepository<tableone, Integer>{

}
