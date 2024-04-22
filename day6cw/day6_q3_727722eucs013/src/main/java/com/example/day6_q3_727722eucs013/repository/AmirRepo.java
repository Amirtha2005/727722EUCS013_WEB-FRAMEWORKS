package com.example.day6_q3_727722eucs013.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day6_q3_727722eucs013.model.AmirModel;


@Repository
public interface AmirRepo extends JpaRepository<AmirModel,Integer>{
    
}
