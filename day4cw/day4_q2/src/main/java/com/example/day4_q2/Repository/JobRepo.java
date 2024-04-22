package com.example.day4_q2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day4_q2.model.Job;


@Repository
public interface JobRepo extends JpaRepository<Job,Integer>{
    
}
