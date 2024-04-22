package com.example.day5_q2_727722eucs013.AmirService;

import org.springframework.stereotype.Service;

import com.example.day5_q2_727722eucs013.AmirModel.Employee;
import com.example.day5_q2_727722eucs013.AmirRepository.EmployeeRepo;


@Service
public class EmployeeService {
    public EmployeeRepo employeeRepo;
    public EmployeeService(EmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(Employee employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,Employee employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public Employee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
