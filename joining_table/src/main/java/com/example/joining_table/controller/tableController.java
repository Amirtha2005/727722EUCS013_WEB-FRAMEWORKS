package com.example.joining_table.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.joining_table.model.table1;
import com.example.joining_table.model.tableone;
import com.example.joining_table.service.tableService;
import com.example.joining_table.service.tableService1;

@RestController
public class tableController {

    @Autowired
    private tableService service;

    @Autowired
    private tableService1 service1;

    @PostMapping("/insert")
    public String create(@RequestBody tableone obj){
        service.addInfo(obj);
        return "added";
    }

    @PostMapping("/insert1")
    public String create1(@RequestBody table1 obj1){
        service1.addInfoo(obj1);
        return "added";
    }
}
