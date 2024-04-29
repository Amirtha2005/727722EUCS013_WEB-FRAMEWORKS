package com.example.onetooneuni.service;

import org.springframework.stereotype.Service;

import com.example.onetooneuni.model.tabletwo;
import com.example.onetooneuni.repository.repoTwo;


@Service
public class serTwo {

    private repoTwo repo2;

    public serTwo(repoTwo repo2) {
        this.repo2 = repo2;
    }


    public void addInfo1(tabletwo obj1){
        repo2.save(obj1);
        }
}
