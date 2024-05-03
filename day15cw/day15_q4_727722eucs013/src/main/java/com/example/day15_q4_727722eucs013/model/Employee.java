package com.example.day15_q4_727722eucs013.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Employee {
    @Id
    public int employeeId;
    public String name;
    public String position;

    @ManyToOne
    public Company company;
}
