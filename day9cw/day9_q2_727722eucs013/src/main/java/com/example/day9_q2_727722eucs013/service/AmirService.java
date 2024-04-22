package com.example.day9_q2_727722eucs013.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day9_q2_727722eucs013.model.AmirModel;
import com.example.day9_q2_727722eucs013.repository.AmirRepo;


@Service
public class AmirService {
    @Autowired
    private AmirRepo rep;

  
    @SuppressWarnings("null")
    public boolean post(AmirModel recipe)
    {
        try
        {
            rep.save(recipe);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public AmirModel getByid(int id)
    {
        return rep.findById(id).orElse(null);
    }

    public List<AmirModel> filter(String name)
    {
        return rep.findByProduct(name);
    }
    
    
}
