package com.nt.service;

import java.util.List;

import com.nt.entity.JobSeekers;

public interface IJoobSeekerMgmtService {
	public JobSeekers addJobSeekerData(JobSeekers seekers);

	public JobSeekers fetchDataByID(Long id);
	
	public List<JobSeekers> fetcheAllData();
	
	public JobSeekers updateSalaryById(Long id, Double salary);
	
	public String deleteJobSeekerById(Long id);
}
