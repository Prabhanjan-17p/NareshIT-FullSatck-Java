package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeekers;
import com.nt.repository.IJobSeekersRepository;

@Service
public class JobSeekerServiceImpl implements IJoobSeekerMgmtService {
	@Autowired
	private IJobSeekersRepository repo;

	// For fetch or retrive purpose used "@Cacheable(value = "jobseekers", key =
	// "#id")"
	@Override
	@Cacheable(value = "JobSeekerCache", key = "#id")
	public JobSeekers fetchDataByID(Long id) {
		JobSeekers js = repo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID: " + id));
		return js;
	}

	@Override
	@Cacheable(value = "AllJobSeeker") // do not add key because there is no parameter
	public List<JobSeekers> fetcheAllData() {
		List<JobSeekers> all = repo.findAll();
		return all;
	}

	// For adding purpose used "@CachePut(value = "JobSeekerCache", key =
	// "#seekers.id")"
	@Override
	@CachePut(value = "JobSeekerCache", key = "#seekers.id")
	public JobSeekers addJobSeekerData(JobSeekers seekers) {
		JobSeekers save = repo.save(seekers);
		return save;
	}

	// For updating salary purpose with cache update
	@Override
	@CachePut(value = "JobSeekerCache", key = "#id") // updates single record cache
	public JobSeekers updateSalaryById(Long id, Double salary) {
		JobSeekers seekers = repo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid ID: " + id));
		Double newSal = seekers.getSalary() + (seekers.getSalary() * salary / 100.0);
		seekers.setSalary(newSal);
		return repo.save(seekers);
	}

	@Override
	@CacheEvict(value = "JobSeekerCache", key = "#id")
	public String deleteJobSeekerById(Long id) {
		 Optional<JobSeekers> byId = repo.findById(id);
		if (byId.isPresent()) {
			repo.deleteById(id);
			return "Id found and delete successfully "+id;
		}
		return"Id not found "+id;
	}

}
