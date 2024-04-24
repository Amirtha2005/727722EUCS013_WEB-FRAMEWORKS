package com.example.ems_tables.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

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
public class leaveForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int leave_id;
    private int employee_id;
    private String leave_type;
    private String start_date;
    private String end_date;
    private String status;
    private String reason;
    

    @OneToOne()
    @JoinColumn(name = "leave_ref")
    @JsonBackReference
    private employee e;

}
