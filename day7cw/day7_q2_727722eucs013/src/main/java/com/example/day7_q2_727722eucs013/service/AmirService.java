package com.example.day7_q2_727722eucs013.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.day7_q2_727722eucs013.model.AmirModel;
import com.example.day7_q2_727722eucs013.repository.AmirRepo;


@Service
public class AmirService {

     @Autowired
     public AmirRepo courseRepo;

     public AmirModel SaveEntity(AmirModel entity) {
          return courseRepo.save(entity);

     }

     public List<AmirModel> getDetails() {
          return courseRepo.findAll();

     }

     public List<AmirModel> findByCourseName(String courseName) {
          return courseRepo.findByCourseName(courseName);
     }

}
