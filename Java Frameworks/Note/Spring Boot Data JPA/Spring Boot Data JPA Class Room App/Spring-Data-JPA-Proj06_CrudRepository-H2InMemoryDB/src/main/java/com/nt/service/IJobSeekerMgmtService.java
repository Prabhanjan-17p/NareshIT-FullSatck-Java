package com.nt.service;
import com.nt.entity.JobSeeker;

public interface IJobSeekerMgmtService {
	public String registerJobSeekerGroup(Iterable<JobSeeker> list);

	public long showJobSeekersCount();

	public Iterable<JobSeeker> showAllJobSeekers();
}
