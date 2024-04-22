package com.example.day8_q3_727722eucs013.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day8_q3_727722eucs013.model.AmirModel;
import com.example.day8_q3_727722eucs013.repository.AmirRepo;


@Service
public class StudentService {
    @Autowired
    private AmirRepo studentRepo;

    public boolean post(AmirModel student) {
        try {
            studentRepo.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<AmirModel> start(int mark) {
        return studentRepo.findByMarksGreaterThan(mark);
    }

    public List<AmirModel> end(int mark) {
        return studentRepo.findByMarksLessThan(mark);
    }

}
