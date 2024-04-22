package com.example.day6_q2_727722eucs013.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6_q2_727722eucs013.model.AmirModel;
import com.example.day6_q2_727722eucs013.repository.AmirRepo;



@Service
public class AmirService {

     @Autowired
     public AmirRepo studentRepo;

     public List<AmirModel> getAll() {
          return studentRepo.findAll();
     }

     public AmirModel post(AmirModel student) {
          return studentRepo.save(student);
     }

     public List<AmirModel> sortedDetails(String field) {
          return studentRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }
}
