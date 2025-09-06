package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.entity.JobSeekers;

public interface IJobServiceMangement  {
	 // --- CREATE ---
    public String registerJobSeeker(JobSeekers seeker);
    public String registerAllJobSeeker(List<JobSeekers> list);

    // --- READ ---
    public JobSeekers findById(Integer id);               
    public Optional<JobSeekers> findByIdOptional(Integer id); 
    public String findByIdStatus(Integer id);            
    public boolean existsById(Integer id);                
    public List<JobSeekers> findAll();                    
    
    // --- UPDATE ---
    public JobSeekers updateJobSeeker(JobSeekers seeker); 
    public String updateJobSeekerStatus(JobSeekers seeker); 
    
    // --- DELETE ---
    public String deleteById(Integer id);                 
    public boolean deleteByIdBoolean(Integer id);         
    public void deleteAll();                              
}
