package com.example.ems_tables.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employee_id;
    private String firstname;
    private String lastname;
    private String gender;
    private String email;
    private long ph_num;
    private String address;
    @Column(name = "department_id", insertable = false, updatable = false)
    private int department_id;
    private String designation;
    private int salaryy;
    @Column(name = "manager_id", insertable = false, updatable = false)
    private int manager_id;

    @ManyToOne()
    @JoinColumn(name = "department_id")
    //@JsonBackReference
    private department department;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    @JsonBackReference
    private department manager;


    // @OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    // @JsonManagedReference
    // private department department;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "emp")
    @JsonManagedReference
    private salary salary;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "e")
    @JsonManagedReference
    private leaveForm leave;
    
}
