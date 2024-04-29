package com.example.onetooneuni.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.onetooneuni.model.tableone;
import com.example.onetooneuni.model.tabletwo;
import com.example.onetooneuni.service.serOne;
import com.example.onetooneuni.service.serTwo;

import jakarta.transaction.Transactional;


@RestController
public class sample {

    private serOne service1;
    private serTwo service2;

    public sample(serOne service1, serTwo service2) {
        this.service1 = service1;
        this.service2 = service2;
    }

    
    @PostMapping("/create")
    public String create(@RequestBody tableone obj){

        // if(obj.getTabletwo()!=null && obj.getTabletwo().getEmp_id() == 0){
        //     throw new IllegalArgumentException("TableTwo must be persisted before saving TableOne");
        // }
        service1.addInfo(obj);
        return "added";
    }

   
    @PostMapping("/create2")
    public String create(@RequestBody tabletwo obj1){
        // if(obj1.getTableone()!=null && obj1.getTableone().getId()==0){
        //     throw new IllegalArgumentException("TableOne must be persisted before saving TableTwo");
        // }
        service2.addInfo1(obj1);
        return "added";
    }


    //get whole values by name
    @GetMapping("/byName/{name}")
    public tableone byName(@PathVariable String name){
        return service1.findByName(name);
    }

    //delete values by name
    //values getting deleted in both the tables
    
    @Transactional
    @DeleteMapping("/deleteByName/{dname}")
    public String deleteByName(@PathVariable String dname){
         service1.deleteByName(dname);
         return "deleted";
    }
}
