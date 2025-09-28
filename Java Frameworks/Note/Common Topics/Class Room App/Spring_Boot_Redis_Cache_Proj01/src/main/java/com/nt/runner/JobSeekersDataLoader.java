package com.nt.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.nt.entity.JobSeekers;
import com.nt.repository.IJobSeekersRepository;
import com.nt.service.IJoobSeekerMgmtService;

@Component
public class JobSeekersDataLoader implements CommandLineRunner {

	@Autowired
	private IJobSeekersRepository repo;

	@Autowired
	private IJoobSeekerMgmtService service;

	@Override
	public void run(String... args) throws Exception {
//        List<JobSeekers> list = Arrays.asList(
//            new JobSeekers(null, "Prabhanjan Amanta", 550000.0, "Java Full Stack", 2025),
//            new JobSeekers(null, "Ankita Das", 480000.0, "React Developer", 2024),
//            new JobSeekers(null, "Rahul Kumar", 600000.0, "Data Analyst", 2025),
//            new JobSeekers(null, "Sneha Mishra", 500000.0, "Python Developer", 2023),
//            new JobSeekers(null, "Arjun Nayak", 450000.0, "Spring Boot Developer", 2025),
//            new JobSeekers(null, "Priya Mohanty", 520000.0, "Front-End Developer", 2024),
//            new JobSeekers(null, "Rakesh Behera", 470000.0, "Cloud Engineer", 2023),
//            new JobSeekers(null, "Manisha Rout", 560000.0, "Machine Learning", 2024),
//            new JobSeekers(null, "Debasish Swain", 530000.0, "Android Developer", 2025),
//            new JobSeekers(null, "Kiran Patnaik", 490000.0, "DevOps Engineer", 2023)
//        );
//
//        repo.saveAll(list);
//        System.out.println("10 JobSeekers demo records inserted successfully!");

//		JobSeekers js1 = service.fetchDataByID(2L);
//		System.out.println(js1);
//		System.out.println("=============================");
//		JobSeekers js2 = service.fetchDataByID(2L);
//		System.out.println(js2);
//		System.out.println("=============================");
//		JobSeekers js3 = service.fetchDataByID(2L);
//		System.out.println(js3);
//		System.out.println("=============================");
//		JobSeekers js4 = service.fetchDataByID(2l);
//		System.out.println(js4);
//		System.out.println("=============================");
//		JobSeekers js5 = service.fetchDataByID(2l);
//		System.out.println(js5);
//		System.out.println("=============================");
		
		//Used for select all we can also stored into cache
//		service.fetcheAllData().forEach(System.out::println);
//		System.out.println("=============================");
//		service.fetcheAllData().forEach(System.out::println);
//		System.out.println("=============================");
//		service.fetcheAllData().forEach(System.out::println);
//		System.out.println("=============================");
//		service.fetcheAllData().forEach(System.out::println);
//		System.out.println("=============================");
//		service.fetcheAllData().forEach(System.out::println);
		
		
		//By adding one new Data into DB also redis cache used
//		JobSeekers seekers = new JobSeekers("Hari Bol Patnaik", 900000.0, "DevOps Engineer", 2020);
//		service.addJobSeekerData(seekers);
//		System.out.println("=============================");
//		System.out.println(service.fetchDataByID(10L));
		
		
//		//After updating also Redis Cache used
//		JobSeekers updateSalaryById = service.updateSalaryById(10L,10.0);
//		System.out.println("Update Salary :: "+updateSalaryById.getSalary());
//		System.out.println("=============================");
//		System.out.println(service.fetchDataByID(10L));
		
		
		// After deleting a record, Redis cache is evicted, so fetching again causes a DB hit (and may throw if data no longer exists).
		String seeker = service.deleteJobSeekerById(352l);
		System.out.println(seeker);
		System.out.println("=============================");
		System.out.println(service.fetchDataByID(10L));
	}
}
