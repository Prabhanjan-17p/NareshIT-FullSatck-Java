package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.MarriageSeeker;
import com.nt.repository.IMarriageSeekerRepository;

@Service
public class MarriageSeekerIMPL implements IMarriageService {
	
	@Autowired
	private IMarriageSeekerRepository repo;

	@Override
	public String insertMarriageSeeker(MarriageSeeker marriageSeeker) {
		int id = repo.save(marriageSeeker).getId();
		return "Data Insert Successfully having ID :: "+id;
	}

	@Override
	public MarriageSeeker showById(Integer id) {
		return repo.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid ID"));
	}

}
