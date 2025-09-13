package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeekers;
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
	
	
}
