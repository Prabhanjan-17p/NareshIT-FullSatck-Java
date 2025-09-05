package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.JobSeekers;
import com.nt.service.JobSeekersMangementIMPL;

@Component
public class TestJobSeekersRunner implements CommandLineRunner {

	@Autowired
	private JobSeekersMangementIMPL seekersMGM;
	
	@Override
	public void run(String... args) throws Exception {
		try {
//			JobSeekers s1 = new JobSeekers("Arun", 50000.0, "Java", 2024);
			JobSeekers s1 = new JobSeekers("Kanha", 90000.0, "Full Stack Java", 2026);
			String id = seekersMGM.registerJobSeeker(s1);
			System.out.println(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
