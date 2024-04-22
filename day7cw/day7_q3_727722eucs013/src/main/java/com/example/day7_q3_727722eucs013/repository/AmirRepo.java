package com.example.day7_q3_727722eucs013.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day7_q3_727722eucs013.model.AmirModel;

import java.util.List;

@Repository
public interface AmirRepo extends JpaRepository<AmirModel,Integer>{

    List<AmirModel> findByDoorId(int doorId);
    List<AmirModel> findByAccessType(String accessType);
    
}
