package com.example.day14_q2_727722eucs013.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day14_q2_727722eucs013.model.Book;


@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {
    
}
