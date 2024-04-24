package com.example.day11_q1_727722eucs013.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
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
}
