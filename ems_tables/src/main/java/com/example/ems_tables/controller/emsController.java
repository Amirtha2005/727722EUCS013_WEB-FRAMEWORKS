package com.example.ems_tables.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ems_tables.model.department;
import com.example.ems_tables.model.employee;
import com.example.ems_tables.model.leaveForm;
import com.example.ems_tables.model.salary;
import com.example.ems_tables.service.DepartmentService;
import com.example.ems_tables.service.EmployeeService;
import com.example.ems_tables.service.LeaveService;
import com.example.ems_tables.service.SalaryService;

@RestController
public class emsController {

    @Autowired
    private DepartmentService service1;

    @Autowired
    private EmployeeService service2;

    @Autowired
    private LeaveService service3;

    @Autowired
    private SalaryService service4;

    @PostMapping("/createDepartment")
    public String create(@RequestBody department obj1){
        service1.addInfo1(obj1);
        return "added1";
    }

    @PostMapping("/createEmployee")
    public String create(@RequestBody employee obj2){

        service2.addInfo2(obj2);
        return "added2";
    }

    @PostMapping("/createLeave")
    public String create(@RequestBody leaveForm obj3){

        service3.addInfo3(obj3);
        return "added3";
    }

    @PostMapping("/createSalary")
    public String create(@RequestBody salary obj4){

        service4.addInfo4(obj4);
        return "added4";
    }

    // @GetMapping("/getByBusName/{busName}")
    // public List<employee> getById(@PathVariable int emp_id){
    //     return service2.getById(emp_id);
    // }

    @DeleteMapping("/getByEmpId/{emp_id}")
    public void getByEmpId(@PathVariable int emp_id){
        service4.getByEmpId(emp_id); 
    }

    @DeleteMapping("/deleteRow/{dept_name}")
    public void getByName(@PathVariable String dept_name){
        service1.getByName(dept_name);
    }

}
