package com.example.day9_q3_727722eucs013.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day9_q3_727722eucs013.model.AmirModel;
import com.example.day9_q3_727722eucs013.repository.AmirRepo;


@Service
public class AmirService {
    @Autowired
    private AmirRepo rep;

    public boolean post(AmirModel person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public AmirModel start(String lastname)
    {
        return rep.findByName(lastname);
    }
    public AmirModel get3(int id)
    {
        return rep.findById(id);
    }

    public List<AmirModel> end(int population)
    {
        return rep.findByPopulation(population);
    }
    
}
