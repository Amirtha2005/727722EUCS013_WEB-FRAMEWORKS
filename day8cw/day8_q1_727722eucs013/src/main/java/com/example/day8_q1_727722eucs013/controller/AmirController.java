package com.example.day8_q1_727722eucs013.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day8_q1_727722eucs013.model.AmirModel;
import com.example.day8_q1_727722eucs013.service.AmirService;

import java.util.*;

@RestController
public class AmirController {
    @Autowired
    private AmirService ser;

    @PostMapping("/person")
    public ResponseEntity<AmirModel> post(@RequestBody AmirModel person) {
        if (ser.post(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/person/startsWithName/{value}")
    public ResponseEntity<List<AmirModel>> getAll(@PathVariable String value) {
        List<AmirModel> li = ser.start(value);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/person/endsWithName/{value}")
    public ResponseEntity<List<AmirModel>> getbyAge(@PathVariable String value) {
        List<AmirModel> li = ser.end(value);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
