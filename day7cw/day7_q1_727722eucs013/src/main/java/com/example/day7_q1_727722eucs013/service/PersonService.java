package com.example.day7_q1_727722eucs013.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.day7_q1_727722eucs013.model.AmirModel;
import com.example.day7_q1_727722eucs013.repository.AmirRepo;


@Service
public class PersonService {

     @Autowired
     public AmirRepo personRepo;

     public AmirModel SaveEntity(AmirModel entity) {
          return personRepo.save(entity);

     }

     public List<AmirModel> getDetails() {
          return personRepo.findAll();

     }

     public List<AmirModel> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}
