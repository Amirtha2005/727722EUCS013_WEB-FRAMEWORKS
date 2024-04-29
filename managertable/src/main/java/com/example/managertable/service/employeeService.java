package com.example.managertable.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.managertable.model.employeeTable;
import com.example.managertable.model.salaryTable;
import com.example.managertable.repository.employeeRepo;
import com.example.managertable.repository.salaryRepo;

@Service
public class employeeService {

    private employeeRepo repo1;
    private salaryRepo repo2;

    public employeeService(employeeRepo repo1, salaryRepo repo2) {
        this.repo1 = repo1;
        this.repo2 = repo2;
    }

    //insert employees
    public void insertEmployees(employeeTable obj){
        repo1.save(obj);
    }

    //delete employee with id
    public void deleteEmployee(int id){
        repo1.deleteById(id);
    }

    //update both tables
    public void updateEmployee(employeeTable obj, int id){

        employeeTable employee=repo1.findById(id).orElseThrow(
            ()-> new IllegalArgumentException("Employee not found with id: "+id)
        );

        //update employee details
        employee.setName(obj.getName());
        employee.setPhoneNumber(obj.getPhoneNumber());
        employee.setEmail(obj.getEmail());
        employee.setAddress(obj.getAddress());
        employee.setRating(obj.getRating());

        //update salary components
        salaryTable salaryContent=employee.getSalaryTable();
        long currentSalary = salaryContent.getSalary();
        int newRating = obj.getRating();
        long newSalary = calculateNewSalary(currentSalary, newRating);
        long newHRA = (long) (newSalary * 0.3);
        long newDA = (long) (newSalary * 0.1);

        salaryContent.setSalary(newSalary);
        salaryContent.setHRA(newHRA);
        salaryContent.setDA(newDA);

        repo1.save(employee);
        repo2.save(salaryContent);
        
    }

    public long calculateNewSalary(long currentSalary, int rating){
        return currentSalary + (currentSalary*rating*5/100);
    }

    //get employee details
    public employeeTable getDetails(int id){
        return repo1.findById(id).orElseThrow(
            ()->new IllegalArgumentException("Employee not found with id: "+id)
        );
    }

    //get all employees
    public List<Object[]> getAllEmployees(){
        return repo1.findAllByIdandName();
    }
}
