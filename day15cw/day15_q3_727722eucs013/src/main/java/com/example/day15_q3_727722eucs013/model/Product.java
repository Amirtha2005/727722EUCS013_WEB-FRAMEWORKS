package com.example.day15_q3_727722eucs013.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    public int id;
    public String name;
    public double price;
}
