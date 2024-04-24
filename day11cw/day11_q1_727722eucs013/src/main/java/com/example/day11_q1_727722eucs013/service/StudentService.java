package com.example.day11_q1_727722eucs013.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.day11_q1_727722eucs013.model.Amir;
import com.example.day11_q1_727722eucs013.repository.AmirRepository;


@Service
public class StudentService {
    public AmirRepository studentRepository;
    public StudentService(AmirRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public Amir saveStudent(Amir student)
    {
        return studentRepository.save(student);
    }
    public List<Amir> getStudents()
    {
        return studentRepository.findAll();
    }
}
