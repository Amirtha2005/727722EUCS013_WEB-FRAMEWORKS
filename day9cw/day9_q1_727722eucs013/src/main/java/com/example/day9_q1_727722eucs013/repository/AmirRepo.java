package com.example.day9_q1_727722eucs013.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.day9_q1_727722eucs013.model.AmirModel;

public interface AmirRepo extends JpaRepository<AmirModel, Integer> {
    @Query("SELECT p FROM Person p WHERE age=?1")
    List<AmirModel> findByAge(int age);
}
