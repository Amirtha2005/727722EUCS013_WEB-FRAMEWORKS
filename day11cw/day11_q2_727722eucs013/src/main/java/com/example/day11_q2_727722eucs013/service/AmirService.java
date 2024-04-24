package com.example.day11_q2_727722eucs013.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.day11_q2_727722eucs013.model.Amir;
import com.example.day11_q2_727722eucs013.model.AmirInfo;
import com.example.day11_q2_727722eucs013.repository.AmirInfoRepository;
import com.example.day11_q2_727722eucs013.repository.AmirRepository;


@Service
public class AmirService {
    public AmirRepository studentRepository;
    public AmirInfoRepository studentInfoRepository;
    public AmirService(AmirRepository studentRepository,AmirInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public Amir saveStudent(Amir student)
    {
        return studentRepository.save(student);
    }
    public AmirInfo saveStudentInfo(AmirInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<Amir> getStudents()
    {
        return studentRepository.findAll();
    }
}
