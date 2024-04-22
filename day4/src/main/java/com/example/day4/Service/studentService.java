package com.example.day4.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.day4.Model.StudentModel;
import com.example.day4.Repository.StudentRepository;



@Service
public class studentService {

    @Autowired
    public StudentRepository repo;


    public String addInfo(List<StudentModel> obj) {
        
        repo.saveAll(obj);
        return "Data inserted";
    }
    
    public List<StudentModel> display() {
        return repo.findAll();

    }
    // deleting data
    public List<StudentModel> delete(int val)
    {
         repo.deleteById(val);
         return repo.findAll();
    }

}