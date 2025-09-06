package com.nt.runners;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.JobSeekers;
import com.nt.service.JobSeekersMangementIMPL;

@Component
public class TestJobSeekersRunner implements CommandLineRunner {

	@Autowired
	private JobSeekersMangementIMPL service;

	@Override
	public void run(String... args) throws Exception {
		try {

			System.out.println("===== CREATE SINGLE JOBSEEKER =====");
			JobSeekers s1 = new JobSeekers("Kanha", 90000.0, "Full Stack Java", 2026);
			String msg1 = service.registerJobSeeker(s1);
			System.out.println(msg1);

			System.out.println("\n===== CREATE MULTIPLE JOBSEEKERS =====");
			List<JobSeekers> seekers = Arrays.asList(new JobSeekers("Ravi", 85000.0, "Java Developer", 2025),
					new JobSeekers("Sita", 95000.0, "Frontend Developer", 2026),
					new JobSeekers("Amit", 88000.0, "Backend Developer", 2024));
			String msg2 = service.registerAllJobSeeker(seekers);
			System.out.println(msg2);

			System.out.println("\n===== READ BY ID =====");
			JobSeekers js = service.findById(1);
			System.out.println(js != null ? js : "JobSeeker not found");

			Optional<JobSeekers> jsOpt = service.findByIdOptional(2);
			System.out.println(jsOpt.isPresent() ? jsOpt.get() : "JobSeeker not found (Optional)");

			String statusMsg = service.findByIdStatus(3);
			System.out.println(statusMsg);

			boolean exists = service.existsById(4);
			System.out.println("Exists ID 4: " + exists);

			System.out.println("\n===== READ ALL =====");
			List<JobSeekers> allSeekers = service.findAll();
			allSeekers.forEach(System.out::println);

			System.out.println("\n===== UPDATE JOBSEEKER =====");
			JobSeekers updateSeeker = new JobSeekers("Kanha Updated", 95000.0, "Full Stack Java", 2026);
			updateSeeker.setId(1); // Must set existing ID
			JobSeekers updated = service.updateJobSeeker(updateSeeker);
			System.out.println(updated != null ? "Updated: " + updated : "Update failed");

			String updateStatus = service.updateJobSeekerStatus(updateSeeker);
			System.out.println(updateStatus);

			System.out.println("\n===== DELETE JOBSEEKER =====");
			String deleteMsg = service.deleteById(3);
			System.out.println(deleteMsg);

			boolean deleteSuccess = service.deleteByIdBoolean(2);
			System.out.println("Delete ID 2 success: " + deleteSuccess);

			System.out.println("\n===== DELETE ALL =====");
			service.deleteAll();
			System.out.println("All JobSeekers deleted.");

			System.out.println("\n===== FINAL CHECK =====");
			List<JobSeekers> finalList = service.findAll();
			System.out.println("Total JobSeekers: " + finalList.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
