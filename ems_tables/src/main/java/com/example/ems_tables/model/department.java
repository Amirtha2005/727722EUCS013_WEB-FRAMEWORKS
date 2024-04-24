package com.example.ems_tables.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int department_id;
    private String department_name;
    private int manager_id;

    @OneToMany(cascade =CascadeType.ALL,mappedBy = "department")
    @JsonManagedReference
    private List<employee> employee;


    // @OneToOne()
    // @JoinColumn(name = "emp_id")
    // @JsonBackReference
    // private employee employee;

}
