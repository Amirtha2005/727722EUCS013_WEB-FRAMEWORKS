package com.example.day9_q1_727722eucs013.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.day9_q1_727722eucs013.model.AmirModel;
import com.example.day9_q1_727722eucs013.repository.AmirRepo;


@Service
public class AmirService {
    public AmirRepo personRepo;

    public AmirService(AmirRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(AmirModel person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<AmirModel> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
