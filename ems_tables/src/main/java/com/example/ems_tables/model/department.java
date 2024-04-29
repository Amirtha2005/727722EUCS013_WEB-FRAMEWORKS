package com.example.ems_tables.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

//import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
//import jakarta.persistence.OneToOne;
//import jakarta.persistence.PrimaryKeyJoinColumn;
//import jakarta.persistence.SecondaryTable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@SecondaryTable(name = "department", pkJoinColumns = @PrimaryKeyJoinColumn(name="employee_id"))
public class department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int department_id;
    private String department_name;
    private int manager_id;


    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<employee> employee; 

    

}
