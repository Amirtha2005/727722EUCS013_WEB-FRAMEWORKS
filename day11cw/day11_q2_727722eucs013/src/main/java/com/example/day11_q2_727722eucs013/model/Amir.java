package com.example.day11_q2_727722eucs013.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Amir {
    @Id
    private int id;
    private String name;

    @OneToOne(mappedBy = "student" , cascade = CascadeType.ALL)
    @JsonManagedReference
    private AmirInfo studentInfo;
}