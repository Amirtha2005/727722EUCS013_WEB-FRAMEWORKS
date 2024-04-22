package com.example.day7_q3_727722eucs013.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day7_q3_727722eucs013.model.AmirModel;
import com.example.day7_q3_727722eucs013.repository.AmirRepo;

@Service
public class AmirService {
    @Autowired
    private AmirRepo rep;

    public boolean post(AmirModel door)
    {
        try
        {
            rep.save(door);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<AmirModel> getAll()
    {
        return rep.findAll();
    }

    public List<AmirModel> getbyDoorId(int doorId)
    {
        return rep.findByDoorId(doorId);
    }
    public List<AmirModel> getbyType(String type)
    {
        return rep.findByAccessType(type);
    }
    
}
