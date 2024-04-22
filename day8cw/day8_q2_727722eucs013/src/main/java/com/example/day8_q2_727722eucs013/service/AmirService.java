package com.example.day8_q2_727722eucs013.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day8_q2_727722eucs013.model.AmirModel;
import com.example.day8_q2_727722eucs013.repository.AmirRepo;


@Service
public class AmirService {
    @Autowired
    private AmirRepo rep;

    @SuppressWarnings("null")
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

    public List<AmirModel> start(String value)
    {
        return rep.findByProductNameStartingWith(value);
    }

    public List<AmirModel> end(String value)
    {
        return rep.findByProductNameEndingWith(value);
    }
    public List<AmirModel> sort()
    {
        return rep.findAll(Sort.by("price"));
    }
    
}
