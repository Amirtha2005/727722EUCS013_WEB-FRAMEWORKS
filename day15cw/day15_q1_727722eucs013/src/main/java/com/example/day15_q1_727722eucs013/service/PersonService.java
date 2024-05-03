package com.example.day15_q1_727722eucs013.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day15_q1_727722eucs013.model.Person;
import com.example.day15_q1_727722eucs013.repository.PersonRepo;



@Service
public class PersonService {
    @Autowired
    public PersonRepo personRepo;
    public List<Person> getData(){
        return personRepo.findAll();
    }
    public Person postDaata(Person p){
        return personRepo.save(p);
    }
}
