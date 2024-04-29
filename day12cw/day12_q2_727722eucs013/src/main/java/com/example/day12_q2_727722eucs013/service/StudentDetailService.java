package com.example.day12_q2_727722eucs013.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day12_q2_727722eucs013.model.StudentDetail;
import com.example.day12_q2_727722eucs013.repository.StudentDetailRepository;
import com.example.day12_q2_727722eucs013.repository.StudentRepository;


@Service
public class StudentDetailService {
    @Autowired
    StudentDetailRepository studentDetailRepository;
    @Autowired
    StudentRepository studentRepository;
    public StudentDetail addStudentDetail(int id,StudentDetail studentDetail)
    {
        if(studentRepository.existsById(id))
        {
            studentDetailRepository.addStudentDetail(studentDetail.getAddress(),studentDetail.getPhoneNumber(),id);
            return studentDetail;
        }
        else
        return null;
    }
    
    
}
