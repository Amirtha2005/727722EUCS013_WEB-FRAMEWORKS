package com.example.onetooneuni.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetooneuni.model.tabletwo;

public interface repoTwo extends JpaRepository<tabletwo,Integer>{

    void deleteByTableoneId(int emp_id);
}