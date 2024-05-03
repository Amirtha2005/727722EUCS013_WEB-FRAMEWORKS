package com.example.day15_q1_727722eucs013.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day15_q1_727722eucs013.model.Person;


public interface PersonRepo extends JpaRepository<Person,Integer> {

}
