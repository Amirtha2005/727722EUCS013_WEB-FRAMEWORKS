package com.example.bidirectional_onetoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bidirectional_onetoone.model.table1;
import com.example.bidirectional_onetoone.model.tableone;
import com.example.bidirectional_onetoone.service.tableService;
import com.example.bidirectional_onetoone.service.tableService1;


@RestController
public class tableController {

    @Autowired
    private tableService service;

    @Autowired
    private tableService1 service1;

    @PostMapping("/insertbi")
    public String create(@RequestBody tableone obj){
        service.addInfo(obj);
        return "added";
    }
    @PostMapping("/insert1bi")
    public String create1(@RequestBody table1 obj1){
        service1.addInfoo(obj1);
        return "added1";
    }
}
