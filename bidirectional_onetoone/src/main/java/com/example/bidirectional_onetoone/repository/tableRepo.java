package com.example.bidirectional_onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bidirectional_onetoone.model.tableone;


public interface tableRepo extends JpaRepository<tableone, Integer>{

}
