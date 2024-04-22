package com.example.day9_q2_727722eucs013.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.day9_q2_727722eucs013.model.AmirModel;
import java.util.List;


@Repository
public interface AmirRepo extends JpaRepository<AmirModel,Integer>{

    @Query("select r from Recipe r where recipeName=?1")
    List<AmirModel> findByProduct(String name);
    
}
