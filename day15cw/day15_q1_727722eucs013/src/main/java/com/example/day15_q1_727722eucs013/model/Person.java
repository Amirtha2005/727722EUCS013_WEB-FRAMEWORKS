package com.example.day15_q1_727722eucs013.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Person {
    @Id
    public int  id;
    public String firstName;
    public String lasttName;
}
