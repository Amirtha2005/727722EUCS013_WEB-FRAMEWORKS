package com.example.ems_tables.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;

//import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class salary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int salary_id;
    private int employee_id;
    private int salary;

    @OneToOne()
    @JoinColumn(name = "salary_ref")
    @JsonBackReference
    private employee employee;

    // @OneToOne(mappedBy = "salary" , cascade = CascadeType.ALL)
    // private employee employee;
}
