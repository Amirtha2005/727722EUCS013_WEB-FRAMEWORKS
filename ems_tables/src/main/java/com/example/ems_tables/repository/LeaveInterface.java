package com.example.ems_tables.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ems_tables.model.leaveForm;

public interface LeaveInterface extends JpaRepository<leaveForm,Integer>{

}
