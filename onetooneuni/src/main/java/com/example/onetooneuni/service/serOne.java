package com.example.onetooneuni.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onetooneuni.model.tableone;
import com.example.onetooneuni.repository.repoOne;
import com.example.onetooneuni.repository.repoTwo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class serOne {

    @Autowired
    private repoOne repo1;
    
    @Autowired
    private repoTwo repo2;

    public void addInfo(tableone obj){
        repo1.save(obj);
    }

    public tableone findByName(String name){
        return repo1.findByName(name);
    }

    //delete by name
    public void deleteByName(String dname){

        if(repo1.existsByName(dname)){
            tableone record = repo1.findByName(dname);

            if(record.getTabletwo()!=null){
                repo2.deleteByTableoneId(record.getId());
            }

           // repo1.delete(record);
        }
         //repo1.deleteByName(dname);
    }

    
}
