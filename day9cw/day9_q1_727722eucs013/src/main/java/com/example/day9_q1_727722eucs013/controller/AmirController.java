package com.example.day9_q1_727722eucs013.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day9_q1_727722eucs013.model.AmirModel;
import com.example.day9_q1_727722eucs013.service.AmirService;



@RestController
public class AmirController {
    public AmirService personService;

    public AmirController(AmirService personService) {
        this.personService = personService;
    }

    @PostMapping("/api/person")
    public ResponseEntity<AmirModel> postMethodName(@RequestBody AmirModel person) {
        if (personService.savePerson(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/api/person/byage/{age}")
    public ResponseEntity<List<AmirModel>> getMethodName(@PathVariable("age") int age) {
        List<AmirModel> list = personService.getPersonByAge(age);
        if (list.size() == 0) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
