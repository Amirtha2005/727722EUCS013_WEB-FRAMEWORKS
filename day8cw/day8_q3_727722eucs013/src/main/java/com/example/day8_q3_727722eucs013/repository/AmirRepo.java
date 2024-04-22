package com.example.day8_q3_727722eucs013.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.day8_q3_727722eucs013.model.AmirModel;

import java.util.List;

@Repository
public interface AmirRepo extends JpaRepository<AmirModel, Long> {

    List<AmirModel> findByMarksGreaterThan(int mark);

    List<AmirModel> findByMarksLessThan(int mark);

}
