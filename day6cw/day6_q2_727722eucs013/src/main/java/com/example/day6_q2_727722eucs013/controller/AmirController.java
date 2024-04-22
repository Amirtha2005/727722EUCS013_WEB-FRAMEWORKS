package com.example.day6_q2_727722eucs013.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.day6_q2_727722eucs013.model.AmirModel;
import com.example.day6_q2_727722eucs013.service.AmirService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AmirController {

     @Autowired
     public AmirService studentService;

     @GetMapping("/api/student")
     public ResponseEntity<List<AmirModel>> getDetails() {
          List<AmirModel> list = studentService.getAll();
          if (list.isEmpty()) {
               return new ResponseEntity<List<AmirModel>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<AmirModel>>(list, HttpStatus.OK);

     }

     @PostMapping("/api/student")
     public ResponseEntity<AmirModel> postMethodName(@RequestBody AmirModel student) {

          AmirModel postData = studentService.post(student);
          return new ResponseEntity<>(postData, HttpStatus.OK);
     }

     @GetMapping("/api/student/sort/{field}")
     public ResponseEntity<List<AmirModel>> sortedDetails(@PathVariable String field) {
          List<AmirModel> list = studentService.sortedDetails(field);
          if (list.isEmpty()) {
               return new ResponseEntity<List<AmirModel>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<AmirModel>>(list, HttpStatus.OK);

     }
}
