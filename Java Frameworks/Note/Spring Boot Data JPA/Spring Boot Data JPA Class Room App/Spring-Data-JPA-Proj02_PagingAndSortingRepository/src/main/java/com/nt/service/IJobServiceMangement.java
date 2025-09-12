package com.nt.service;


import java.util.List;

import org.springframework.data.domain.Page;

import com.nt.entity.JobSeekers;

public interface IJobServiceMangement  {
	public String saveAllJobSeeker(List<JobSeekers> list);
	public Iterable<JobSeekers> showJobSeekerAsSorted(boolean ascorder, String ...pros);                   
	public Page<JobSeekers> showJsDetailsByPagination(int pageNo, int pageSize);
	public Page<JobSeekers> showJsDetailsByPaginationAndSorting(int pageNo, int pageSize,boolean ascorder, String ...pros);
	public void showAllPagesData(int pageSize);
}
