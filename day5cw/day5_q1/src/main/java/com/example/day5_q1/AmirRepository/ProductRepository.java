package com.example.day5_q1.AmirRepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5_q1.AmirModel.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{
    
}
