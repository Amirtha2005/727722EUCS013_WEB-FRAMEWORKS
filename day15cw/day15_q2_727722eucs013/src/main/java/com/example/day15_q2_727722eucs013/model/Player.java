package com.example.day15_q2_727722eucs013.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Player {
    @Id
    public int id;

    public String playerName;
    public String team;
    public int age;
}
