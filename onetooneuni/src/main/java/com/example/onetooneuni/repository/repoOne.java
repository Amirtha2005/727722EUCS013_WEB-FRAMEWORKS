package com.example.onetooneuni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.onetooneuni.model.tableone;

import jakarta.transaction.Transactional;

public interface repoOne extends JpaRepository<tableone,Integer>{

    public tableone findByName(String name);
    public boolean existsByName(String name);

    // @Transactional
    // @Modifying
    // @Query("delete from tableone t where t.name= :name")
    // void deleteByName(String name);
}
