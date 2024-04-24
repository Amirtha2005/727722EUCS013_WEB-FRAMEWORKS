package com.example.day11_q2_727722eucs013.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AmirInfo {
    @Id
    private int id;
    private String address;
    private String phNo;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonBackReference
    private Amir student;
}
