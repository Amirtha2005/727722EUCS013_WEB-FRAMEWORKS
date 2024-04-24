package com.example.bidirectional_onetoone.service;

import org.springframework.stereotype.Service;

import com.example.bidirectional_onetoone.model.table1;
import com.example.bidirectional_onetoone.repository.tableRepo1;


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
