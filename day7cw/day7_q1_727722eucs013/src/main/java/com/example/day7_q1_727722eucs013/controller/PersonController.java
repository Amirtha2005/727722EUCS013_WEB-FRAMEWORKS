package com.example.day7_q1_727722eucs013.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.day7_q1_727722eucs013.model.AmirModel;
import com.example.day7_q1_727722eucs013.service.PersonService;

@RestController
public class PersonController {

     @Autowired
     public PersonService personService;

     @PostMapping("/api/person")
     public ResponseEntity<AmirModel> postMethodName(@RequestBody AmirModel entity) {

          AmirModel inst = personService.SaveEntity(entity);

          return new ResponseEntity<AmirModel>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<AmirModel>> getMethodName() {

          List<AmirModel> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<AmirModel>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<AmirModel>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<AmirModel> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}