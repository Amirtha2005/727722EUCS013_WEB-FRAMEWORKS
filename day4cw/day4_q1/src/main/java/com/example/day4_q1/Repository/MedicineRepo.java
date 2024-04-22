package com.example.day4_q1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day4_q1.model.Medicine;


public interface MedicineRepo extends JpaRepository<Medicine,Integer>{
    
}