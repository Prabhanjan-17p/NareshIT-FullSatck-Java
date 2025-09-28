package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeekers;
import com.nt.repository.IJobSeekersRepository;

@Service
public class JobSeekerServiceImpl implements IJoobSeekerMgmtService {
	@Autowired
	private IJobSeekersRepository repo;

	@Override
	public String addJobSeekerData(JobSeekers seekers) {
		Integer id = repo.save(seekers).getId();
		return "JobSeeker Added Successfully Having ID :: "+id;
	}

	@Override
	public void fetchDataByID(Long id) {
		JobSeekers byId = repo.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid ID"));
	}

}
