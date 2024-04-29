package com.example.managertable.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class salaryTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int salaryId;
    private long salary;
    private long HRA;
    private long DA;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Id")
    @JsonBackReference
    private employeeTable employeeTable;

    public salaryTable(long salary) {
        this.salary = salary;
        calculateHraAndDa();
    }

    @PrePersist
    public void calculateHraAndDa(){
        this.HRA = (long) (salary * 0.3);
        this.DA = (long) (salary * 0.1);
    }
}
