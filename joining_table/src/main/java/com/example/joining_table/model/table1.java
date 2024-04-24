package com.example.joining_table.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

//import java.util.Date;

@Entity
public class table1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private String gender;
    //private Date dob;
    private String location;

    @OneToOne()
    @JoinColumn(name = "reference")
    private tableone tableone;

    public tableone getTableone() {
        return tableone;
    }
    public void setTableone(tableone tableone) {
        this.tableone = tableone;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    // public Date getDob() {
    //     return dob;
    // }
    // public void setDob(Date dob) {
    //     this.dob = dob;
    // }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}
