package com.example.ems1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ems1.model.employeeModel;
import com.example.ems1.repository.employeeRepository;

@Service
public class employeeService {

    @Autowired
    public employeeRepository repo;

    public String addInfo(List<employeeModel> obj){
        repo.saveAll(obj);
        return "Data inserted";
    }

    public List<employeeModel> display(){
        return repo.findAll();
    }

    public String delete(int id){
        repo.deleteById(id);
        return "deleted";
    }

    public String update(long id, List<employeeModel> obj){
        repo.saveAll(obj);
        return "updated";
    }
}
