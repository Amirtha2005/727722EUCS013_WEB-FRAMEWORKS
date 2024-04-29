package com.example.day12_q2_727722eucs013.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day12_q2_727722eucs013.model.Student;
import com.example.day12_q2_727722eucs013.repository.StudentRepository;


@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public Student addStudents(Student student)
    {
        return studentRepository.save(student);
    }
    public List<Student>getStudent()
    {
        return studentRepository.findAll();
    }
    public List<Student>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List<Student>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}
