package com.example.joining_table.service;

import org.springframework.stereotype.Service;

import com.example.joining_table.model.tableone;
import com.example.joining_table.repository.tableRepo;

@Service
public class tableService {

    private tableRepo repo;

    public tableService(tableRepo repo) {
        this.repo = repo;
    }

    public void addInfo(tableone obj){
        repo.save(obj);
    }
}
