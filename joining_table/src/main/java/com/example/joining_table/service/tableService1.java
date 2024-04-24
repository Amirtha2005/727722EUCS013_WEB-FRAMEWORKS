package com.example.joining_table.service;

import org.springframework.stereotype.Service;

import com.example.joining_table.model.table1;
import com.example.joining_table.repository.tableRepo1;

@Service
public class tableService1 {

    private tableRepo1 repo1;

    public tableService1(tableRepo1 repo1) {
        this.repo1 = repo1;
    }

    public void addInfoo(table1 obj1){
        repo1.save(obj1);
    }
}
