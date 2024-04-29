package com.example.ems_tables.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ems_tables.model.employee;
import com.example.ems_tables.model.salary;
import com.example.ems_tables.repository.EmployeeInterface;
import com.example.ems_tables.repository.SalaryInterface;

@Service
public class SalaryService {

    private SalaryInterface repo4;
    private EmployeeInterface employeeInterface;

    public SalaryService(SalaryInterface repo4,EmployeeInterface employeeInterface) {
        this.repo4 = repo4;
        this.employeeInterface=employeeInterface;
    }

    public void addInfo4(salary obj4){
        repo4.save(obj4);
    }

    
    // public void getByEmpId(int emp_id){
    //     List<employee> em=employeeInterface.getAllEmployee();
    //     for(employee x:em){
    //         if(x!=null){
    //             if(x.getEmployee_id()==emp_id){
    //                 employeeInterface.deleteById(emp_id);
    //             }
    //         }
    //     }
    //     // repo2.getByEmpId(emp_id);
    // }

    
    public void getByEmpId(int emp_id){
        List<employee> em=employeeInterface.getAllEmployee();
        for(employee x:em){
            if(x!=null){
                if(x.getEmployee_id()==emp_id){
                    employeeInterface.deleteById(emp_id);
                }
            }
        }
        // repo2.getByEmpId(emp_id);
    }
}
