package com.example.day15_q3_727722eucs013.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day15_q3_727722eucs013.model.Product;
import com.example.day15_q3_727722eucs013.repository.ProductRepo;


@Service
public class ProductService{
    @Autowired
    public ProductRepo productRepo;

    public Product postData(Product p){
        return productRepo.save(p);
    }

    public Product getOneData(int id){
        return productRepo.findById(id).orElseThrow();
    }

    public List<Product> getData(){
        return productRepo.findAll();
    }

    public void deleteData(int id){
        productRepo.deleteById(id);
    }

    public Product putData(int id,Product p){
        Product pr=productRepo.findById(id).orElseThrow();
        pr.setName(p.getName());
        pr.setPrice(p.getPrice());
        return productRepo.save(pr);
    }
}
