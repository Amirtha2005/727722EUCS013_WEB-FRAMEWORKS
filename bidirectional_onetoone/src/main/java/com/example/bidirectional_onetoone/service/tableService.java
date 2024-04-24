package com.example.bidirectional_onetoone.service;

import org.springframework.stereotype.Service;

import com.example.bidirectional_onetoone.model.tableone;
import com.example.bidirectional_onetoone.repository.tableRepo;


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
