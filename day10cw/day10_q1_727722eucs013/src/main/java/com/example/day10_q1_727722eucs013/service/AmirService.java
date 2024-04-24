package com.example.day10_q1_727722eucs013.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day10_q1_727722eucs013.model.AmirDoor;
import com.example.day10_q1_727722eucs013.repository.AmirRepo;


@Service
public class AmirService {
    @Autowired
    private AmirRepo doorRepo;

    public AmirDoor postData(AmirDoor door) {
        return doorRepo.save(door);
    }

    public List<AmirDoor> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public AmirDoor updateDetail(int doorid, AmirDoor door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<AmirDoor> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<AmirDoor> getAllDetails() {

        return doorRepo.findAll();
    }

    public AmirDoor getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}