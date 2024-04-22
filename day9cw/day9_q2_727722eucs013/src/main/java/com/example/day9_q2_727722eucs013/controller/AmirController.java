package com.example.day9_q2_727722eucs013.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.day9_q2_727722eucs013.model.AmirModel;
import com.example.day9_q2_727722eucs013.service.AmirService;

import java.util.*;


@RestController
public class AmirController {
    @Autowired
    private AmirService ser;

    @PostMapping("/api/recipe")
    public ResponseEntity<AmirModel> post(@RequestBody AmirModel person) {
        if (ser.post(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/recipe/byname")
    public ResponseEntity<List<AmirModel>> getAllbyFiltering(@RequestParam("recipeName") String recipeName) {
        List<AmirModel> li = ser.filter(recipeName);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/recipe/{recipeId}")
    public ResponseEntity<AmirModel> getbyrecipeId(@PathVariable("recipeId") int recipeId) {
        AmirModel li = ser.getByid(recipeId);
        if (li!=null) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
