package com.example.day11_q1_727722eucs013.model;

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

    @OneToOne(cascade = CascadeType.ALL)
    private AmirInfo studentInfo;
}
