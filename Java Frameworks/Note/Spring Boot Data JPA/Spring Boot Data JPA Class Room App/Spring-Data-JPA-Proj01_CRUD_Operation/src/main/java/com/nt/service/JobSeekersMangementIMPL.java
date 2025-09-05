package com.nt.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeekers;
import com.nt.repository.IJobSeekersRepository;

@Service
public class JobSeekersMangementIMPL implements IJobServiceMangement {
	@Autowired
	private IJobSeekersRepository repo;

	@Override
	public String registerJobSeeker(JobSeekers seeker) {
		System.out.println("Proxy Obj Class name :: "+repo.getClass() + "-------------"+(Arrays.toString(repo.getClass().getInterfaces())+"-------------"+(Arrays.toString(repo.getClass().getDeclaredMethods()))));
		JobSeekers save = repo.save(seeker);
		return "Data added Id :: "+save.getId();
	}

}
