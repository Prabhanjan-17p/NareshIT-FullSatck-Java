package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeekers;
import com.nt.exception.InvalidJobSeekerID;
import com.nt.repository.IJobSeekersRepository;


@Service
public class JobSeekersMangementIMPL implements IJobServiceMangement {

	@Autowired
	private IJobSeekersRepository repo;

	@Override
	public String removeJobSeekersInBatch(List<Integer> ids) {
		List<JobSeekers> allById = repo.findAllById(ids);
		if (allById.size() != 0 ) {
			repo.deleteAllById(ids);
			return allById.size()+" record delete.";
		}
		return "No record are found";
	}

	@Override
	public List<JobSeekers> searchJobSeekerByData(JobSeekers js, boolean ascOrd, String... pros) {
		Sort sort = Sort.by(ascOrd?Sort.Direction.ASC:Sort.Direction.DESC, pros);
		Example<JobSeekers> example = Example.of(js);
		List<JobSeekers> list = repo.findAll(example);
		return list;
	}

	@Override
	public JobSeekers fetchJSByID(int id) {
		// Uses findById which hits the database immediately and returns an Optional.
	    // Throws custom exception if ID not found.
		JobSeekers seekers = repo.findById(id).orElseThrow(() -> new InvalidJobSeekerID("Invalid ID"));
		return seekers;
	}

	@Override
	public JobSeekers showByID(int id) {
		 // Uses getReferenceById which returns a lazy-loaded proxy.
	    // Database is hit only when a property of the entity is accessed.
		JobSeekers proxy = repo.getReferenceById(id);
		return proxy;
	}
	
	
	
}
