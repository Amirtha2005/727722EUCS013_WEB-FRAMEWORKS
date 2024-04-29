package com.example.ems_tables.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ems_tables.model.department;
import com.example.ems_tables.model.employee;
import com.example.ems_tables.repository.DepartmentInterface;
import com.example.ems_tables.repository.EmployeeInterface;



@Service
public class DepartmentService {

    private DepartmentInterface repo1;

    @Autowired
    private EmployeeInterface employeeInterface;


    public DepartmentService(DepartmentInterface repo1) {
        this.repo1 = repo1;
    }

    public void addInfo1(department obj1){
        repo1.save(obj1);
    }

    public void getByName(String dept_name){
        List<employee> li=employeeInterface.getAllEmployee();

        for(employee x: li){
            if(x!=null){
                if(x.getDepartment_name()==dept_name){
                    employeeInterface.deleteById(x.getEmployee_id());
                }
            }
        }
    }
}
