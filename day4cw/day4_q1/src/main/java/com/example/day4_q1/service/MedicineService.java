package com.example.day4_q1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.day4_q1.Repository.MedicineRepo;
import com.example.day4_q1.model.Medicine;



@Service
public class MedicineService {
    public MedicineRepo medicineRepo;
    public MedicineService(MedicineRepo medicineRepo)
    {
        this.medicineRepo = medicineRepo;
    }
    public boolean saveMedicine(Medicine medicine)
    {
        try{
            medicineRepo.save(medicine);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<Medicine> getMedicines()
    {
        return medicineRepo.findAll();
    }

    public Medicine MedicineById(int id)
    {
        Optional<Medicine> obj = medicineRepo.findById(id);
        return obj.orElse(new Medicine());
    }

}