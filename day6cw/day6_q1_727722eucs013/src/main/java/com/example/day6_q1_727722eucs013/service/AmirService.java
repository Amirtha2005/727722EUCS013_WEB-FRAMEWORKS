package com.example.day6_q1_727722eucs013.service;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.day6_q1_727722eucs013.model.AmirModel;
import com.example.day6_q1_727722eucs013.repository.AmirRepo;


@Service
public class AmirService {

     @Autowired
     public AmirRepo childrenRepo;

     public List<AmirModel> sort(String field) {
          return childrenRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }

     public AmirModel save(AmirModel children) {
          return childrenRepo.save(children);

     }

     public List<AmirModel> sortedPage(int offset, int pagesize, String field) {
          Page<AmirModel> sortedPage = childrenRepo
                    .findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
          return sortedPage.getContent();
     }

     public List<AmirModel> pagination(int offset, int pagesize) {
          Page<AmirModel> pages = childrenRepo.findAll(PageRequest.of(offset, pagesize));
          return pages.getContent();

     }

}
