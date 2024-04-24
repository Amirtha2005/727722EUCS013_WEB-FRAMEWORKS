package com.example.ems_tables.service;

import org.springframework.stereotype.Service;

import com.example.ems_tables.model.leaveForm;
import com.example.ems_tables.repository.LeaveInterface;

@Service
public class LeaveService {

    private LeaveInterface repo3;

    public LeaveService(LeaveInterface repo3) {
        this.repo3 = repo3;
    }
    public void addInfo3(leaveForm obj3){
        repo3.save(obj3);
    }
}
