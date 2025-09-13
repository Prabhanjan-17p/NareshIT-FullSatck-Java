package com.nt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.entity.JobSeekers;

public interface IJobSeekersRepository extends CrudRepository<JobSeekers, Integer>,PagingAndSortingRepository<JobSeekers, Integer>  {

}
