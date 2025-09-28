package com.nt.service;

import com.nt.entity.JobSeekers;

public interface IJoobSeekerMgmtService {
	public String addJobSeekerData(JobSeekers seekers);

	public void fetchDataByID(Long id);
}
