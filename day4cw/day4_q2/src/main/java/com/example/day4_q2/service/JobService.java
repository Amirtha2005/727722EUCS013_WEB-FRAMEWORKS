package com.example.day4_q2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.day4_q2.Repository.JobRepo;
import com.example.day4_q2.model.Job;



@Service
public class JobService {
    public JobRepo jobRepo;
    public JobService(JobRepo jobRepo)
    {
        this.jobRepo = jobRepo;
    }
    public boolean saveJob(Job job)
    {
        try{
            jobRepo.save(job);
        } 
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<Job> getJobs()
    {
        return jobRepo.findAll();
    }
    public Job getJobById(int id)
    {
        Optional<Job> obj = jobRepo.findById(id);
        return obj.orElse(null);
    }
}