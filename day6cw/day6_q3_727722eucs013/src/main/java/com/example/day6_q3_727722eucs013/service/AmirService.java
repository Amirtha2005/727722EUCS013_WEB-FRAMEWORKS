package com.example.day6_q3_727722eucs013.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6_q3_727722eucs013.model.AmirModel;
import com.example.day6_q3_727722eucs013.repository.AmirRepo;


@Service
public class AmirService {
    public AmirRepo productRepo;
    public AmirService(AmirRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(AmirModel product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<AmirModel> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<AmirModel> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public AmirModel getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
