package com.example.day11_q2_727722eucs013.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day11_q2_727722eucs013.model.Amir;

@Repository
public interface AmirRepository extends JpaRepository<Amir,Integer>{
    
}
