package com.example.ems1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Manage_Employees")
public class employeeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long emp_id;

    private String name;

     @Column(name = "Phone")
    private long ph_no;

    private String email;
    private String designation;

    @Column(name = "Department")
    private String dept;
    public long getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(long emp_id) {
        this.emp_id = emp_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getPh_no() {
        return ph_no;
    }
    public void setPh_no(long ph_no) {
        this.ph_no = ph_no;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }

    
}
