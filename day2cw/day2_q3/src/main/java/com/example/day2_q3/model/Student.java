package com.example.day2_q3.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Student {
    private String id;
    private String name;
    @JsonIgnore
    private String description;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
}
