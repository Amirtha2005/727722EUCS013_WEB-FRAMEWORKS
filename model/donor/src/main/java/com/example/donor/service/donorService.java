package com.example.donor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.donor.model.donor;
import com.example.donor.repository.donorRepo;

@Service
public class donorService {

    @Autowired
    private donorRepo repo;

    public donor create(donor obj){
        return repo.save(obj);
    }

    public donor findByName(String name){
        
    }
}
