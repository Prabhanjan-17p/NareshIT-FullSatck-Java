package com.nt.listener;

import java.util.Date;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;


@Component
public class JobMonitoringListner implements JobExecutionListener {
	private long start,end;
	
	@Override
	public void beforeJob(JobExecution jobExecution) {
		System.out.println("JobMonitoringListner.beforeJob()");
		start = System.currentTimeMillis();
		System.out.println("Job Started at :: "+ new Date());
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		System.out.println("JobMonitoringListner.afterJob()");
		end = System.currentTimeMillis();
		System.out.println("Job Execution end at :: "+ new Date());
		System.out.println("Job excution Total Time Taken :: "+(end-start)+"ms");
		System.out.println("Job execution status :: "+jobExecution.getExitStatus());
	}

}
