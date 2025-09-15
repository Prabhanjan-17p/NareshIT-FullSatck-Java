package com.nt.service;

import java.util.List;

import com.nt.entity.JobSeekers;


public interface IJobServiceMangement  {
	public String removeJobSeekersInBatch(List<Integer> ids);
	public List<JobSeekers> searchJobSeekerByData(JobSeekers js,boolean ascOrd, String ...pros);
	public JobSeekers fetchJSByID(int id);
	public JobSeekers showByID(int id);
}
