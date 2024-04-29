package com.example.day13_q1_727722eucs013.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day13_q1_727722eucs013.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
