package com.example.day7_q2_727722eucs013.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day7_q2_727722eucs013.model.AmirModel;


@Repository
public interface AmirRepo extends JpaRepository<AmirModel, Integer> {

     List<AmirModel> findByCourseName(String courseName);

}