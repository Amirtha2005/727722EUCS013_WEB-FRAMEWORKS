package com.example.day7_q2_727722eucs013.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.day7_q2_727722eucs013.model.AmirModel;
import com.example.day7_q2_727722eucs013.service.AmirService;

@RestController
public class AmirController {

     @Autowired
     public AmirService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<AmirModel> postMethodName(@RequestBody AmirModel entity) {

          AmirModel inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<AmirModel>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<AmirModel>> getMethodName() {

          List<AmirModel> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<AmirModel>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<AmirModel>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<AmirModel> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}