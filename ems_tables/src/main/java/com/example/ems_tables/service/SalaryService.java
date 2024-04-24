package com.example.ems_tables.service;

import org.springframework.stereotype.Service;

import com.example.ems_tables.model.salary;
import com.example.ems_tables.repository.SalaryInterface;

@Service
public class SalaryService {

    private SalaryInterface repo4;

    public SalaryService(SalaryInterface repo4) {
        this.repo4 = repo4;
    }

    public void addInfo4(salary obj4){
        repo4.save(obj4);
    }
}
