package com.example.day15_q3_727722eucs013.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day15_q3_727722eucs013.model.Product;


public interface ProductRepo extends JpaRepository<Product,Integer> {

}
