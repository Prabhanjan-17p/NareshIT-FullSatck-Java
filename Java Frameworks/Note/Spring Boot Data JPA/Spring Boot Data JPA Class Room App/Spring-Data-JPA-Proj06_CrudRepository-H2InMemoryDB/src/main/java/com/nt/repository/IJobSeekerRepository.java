package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.JobSeeker;

public interface IJobSeekerRepository extends CrudRepository<JobSeeker, Integer> {

}
