package com.example.donor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.donor.model.donor;
import com.example.donor.service.donorService;

@RestController
public class donorController {

    @Autowired
    private donorService service;

    @PostMapping("/addDonor")
    public  donor create(@RequestBody donor obj){
        return service.create(obj);
    }

    @GetMapping("/displayDonor/{name}")
    public donor display(@PathVariable String name){
        return service.findByName(name);
    }

    @DeleteMapping("/deleteById/{id}")
    public String delete(@PathVariable int id){
        service .delete(id);
        return "deleted";
    }

    @PutMapping("/updateDetails/{id}")
    public String update(@RequestBody donor obj, @PathVariable int id){
        service.update(obj,id);
        return "updated";
    }

}
