package com.example.donor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.donor.model.donor;

public interface donorRepo extends JpaRepository<donor,Integer>{

}
