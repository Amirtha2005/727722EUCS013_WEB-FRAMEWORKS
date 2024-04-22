package com.example.day9_q3_727722eucs013.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.day9_q3_727722eucs013.model.AmirModel;
import java.util.List;

@Repository
public interface AmirRepo extends JpaRepository<AmirModel, Integer> {

    @Query("select v from Village as v where v.villageName=?1")
    AmirModel findByName(String villageName);

    @Query("select v from Village as v where v.villageId=?1")
    AmirModel findById(int id);

    @Query("select v from Village as v where v.villagePopulation=?1")
    List<AmirModel> findByPopulation(int population);

}
