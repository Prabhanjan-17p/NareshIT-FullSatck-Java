package com.nt.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.JobSeekers;
import com.nt.repository.IJobSeekersRepository;

@Component
public class TestJobSeekersRunner implements CommandLineRunner {
	@Autowired
	private IJobSeekersRepository repo;

	@Override
	public void run(String... args) throws Exception {
//		List<JobSeekers> jobSeekersList = Arrays.asList(new JobSeekers("Ramesh", 450000.0, "Java", 2022),
//				new JobSeekers("Suresh", 500000.0, "Python", 2021), new JobSeekers("Mahesh", 600000.0, "Java", 2023),
//				new JobSeekers("Anita", 300000.0, "React", 2020), new JobSeekers("Sunita", 700000.0, "Angular", 2019),
//				new JobSeekers("Pooja", 480000.0, "C++", 2022), new JobSeekers("Rajesh", 550000.0, "JavaScript", 2021),
//				new JobSeekers("Karan", 250000.0, "Java", 2023), new JobSeekers("Mohan", 520000.0, "Node.js", 2020),
//				new JobSeekers("Priya", 650000.0, "Vue.js", 2021), new JobSeekers("Arjun", 400000.0, "C#", 2019),
//				new JobSeekers("Lakshmi", 470000.0, "Oracle", 2022),
//				new JobSeekers("Vikram", 800000.0, "Spring Boot", 2021),
//				new JobSeekers("Deepak", 350000.0, "Hibernate", 2020),
//				new JobSeekers("Sneha", 900000.0, "MongoDB", 2023), new JobSeekers("Kavita", 420000.0, "SQL", 2022),
//				new JobSeekers("Nisha", 750000.0, "AWS", 2021), new JobSeekers("Amit", 620000.0, "Docker", 2020),
//				new JobSeekers("Manish", 680000.0, "Kubernetes", 2021),
//				new JobSeekers("Seema", 470000.0, "Microservices", 2022),
//				new JobSeekers("Rahul", 550000.0, "Spring Cloud", 2023), new JobSeekers("Alok", 260000.0, "Java", 2020),
//				new JobSeekers("Geeta", 390000.0, "Python", 2021), new JobSeekers("Ritu", 580000.0, "JavaScript", 2019),
//				new JobSeekers("Neha", 440000.0, "React", 2022), new JobSeekers("Vivek", 330000.0, "Angular", 2020),
//				new JobSeekers("Kiran", 710000.0, "C++", 2021), new JobSeekers("Ajay", 500000.0, "Node.js", 2023),
//				new JobSeekers("Swati", 640000.0, "SQL", 2022), new JobSeekers("Anil", 380000.0, "Spring Boot", 2020));
//
//		repo.saveAll(jobSeekersList);
		
		
		try {
			//repo.findByCourseEquals("Java").forEach(System.out::println);
			//repo.readByCourseIs("Java").forEach(System.out::println);
			//repo.getByCourse("Java").forEach(System.out::println);
			//repo.findBySalaryBetween(300000.0,500000.0).forEach(System.out::println);
			//repo.findBySalaryGreaterThanEqualAndSalaryLessThanEqual(300000.0,500000.0).forEach(System.out::println);
			//repo.findByCourseInOrderBySalaryDesc(List.of("Java","JavaScript")).forEach(System.out::println);
			//repo.findByCourseInOrderBySalaryAsc(List.of("Java","JavaScript")).forEach(System.out::println);
			//repo.findByNameStartingWith("a").forEach(System.out::println);
			//repo.findByNameEndingWith("a").forEach(System.out::println);
			//repo.findByNameContaining("oo").forEach(System.out::println);
			//repo.findByNameEqualsIgnoreCase("pooja").forEach(System.out::println);
			//repo.findByCourseLikeAndYearIn("Java",List.of(2020,2019,2021)).forEach(System.out::println);
			repo.findByCourseNotInAndYearNotIn(List.of("Java"),List.of(2020,2019)).forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
