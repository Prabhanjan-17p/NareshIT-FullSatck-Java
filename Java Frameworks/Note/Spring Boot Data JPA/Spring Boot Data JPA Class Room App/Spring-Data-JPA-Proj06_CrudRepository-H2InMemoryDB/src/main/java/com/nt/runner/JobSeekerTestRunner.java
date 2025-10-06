package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.JobSeeker;
import com.nt.service.IJobSeekerMgmtService;

@Component
public class JobSeekerTestRunner implements CommandLineRunner {
	@Autowired
	private IJobSeekerMgmtService jsService;

	@Override
	public void run(String... args) throws Exception {

		try {
			JobSeeker js1 = new JobSeeker("ramesh", "hyd6", "B.E", 50090.0f, "ramesh@g.com");
			JobSeeker js2 = new JobSeeker("suresh", "vizag4", "B.Tech", 70200.0f, "nagesh@g.com");
			JobSeeker js3 = new JobSeeker("mahesh", "vizag2", "B.E", 70000.0f, "mahesh@g.com");
			JobSeeker js4 = new JobSeeker("1Ramesh", "hyd1", "B.E", 50400.0f, "ramesh@g.com");
			JobSeeker js5 = new JobSeeker("2Suresh", "vizag1", "B.Tech", 71010.0f, "nagesh@g.com");
			JobSeeker js6 = new JobSeeker("3Mahesh", "vizag3", "B.E", 70100.0f, "mahesh@g.com");

			List<JobSeeker> list = List.of(js1, js2, js3, js4, js5, js6);
			String msg = jsService.registerJobSeekerGroup(list);
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("=======================");

		try {
			long count = jsService.showJobSeekersCount();
			System.out.println("JobSeekers count is ::" + count);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("=======================");
		try {
			Iterable<JobSeeker> list = jsService.showAllJobSeekers();
			list.forEach(js -> {
				System.out.println(js);
			});
			System.out.println("=============");
			list.forEach(System.out::println);
		} // try
		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Press Any key to  stop the application");
		System.in.read();

	}// main

}// class
