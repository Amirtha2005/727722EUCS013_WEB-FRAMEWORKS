package com.example.ems_tables.service;

import org.springframework.stereotype.Service;

import com.example.ems_tables.model.department;
import com.example.ems_tables.repository.DepartmentInterface;

@Service
public class DepartmentService {

    private DepartmentInterface repo1;

    public DepartmentService(DepartmentInterface repo1) {
        this.repo1 = repo1;
    }

    public void addInfo1(department obj1){
        repo1.save(obj1);
    }
}
