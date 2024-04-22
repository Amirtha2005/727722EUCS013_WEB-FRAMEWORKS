package com.example.day8_q2_727722eucs013.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day8_q2_727722eucs013.model.AmirModel;

import java.util.List;


@Repository
public interface AmirRepo extends JpaRepository<AmirModel,Integer>{

    List<AmirModel> findByProductNameStartingWith(String name);
    List<AmirModel> findByProductNameEndingWith(String name);
    
}
