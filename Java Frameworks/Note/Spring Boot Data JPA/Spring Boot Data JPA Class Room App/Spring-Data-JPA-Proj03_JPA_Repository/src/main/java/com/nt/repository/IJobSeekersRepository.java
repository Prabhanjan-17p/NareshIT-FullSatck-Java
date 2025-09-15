package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.JobSeekers;

public interface IJobSeekersRepository extends JpaRepository<JobSeekers, Integer> {

}
