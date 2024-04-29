package com.example.day14_q1_727722eucs013.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14_q1_727722eucs013.model.AmirPayroll;
import com.example.day14_q1_727722eucs013.repository.PayrollRepo;


@Service
public class PayrollService {
    @Autowired
    PayrollRepo payrollRepo;

    public AmirPayroll addPayroll(Long id,AmirPayroll payroll)
    {
        AmirPayroll avail = payrollRepo.findById(id).orElse(null);

        if(avail!=null){
            avail.setAmount(payroll.getAmount());
            avail.setNoOfDaysWorked(payroll.getNoOfDaysWorked());
        return payrollRepo.save(avail);
        }
        else 
        return null;
    }

    public Optional<AmirPayroll> getPayroll(Long employeeId)
    {
        return payrollRepo.findById(employeeId);
    }
}
