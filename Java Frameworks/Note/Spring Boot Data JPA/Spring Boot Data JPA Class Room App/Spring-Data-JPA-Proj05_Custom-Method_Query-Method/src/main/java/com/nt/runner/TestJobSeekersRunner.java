package com.nt.runner;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

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
//		List<JobSeekers> jobSeekersList = Arrays.asList(
//			    new JobSeekers("Ramesh", 450000.0, "Java", "ramesh@gmail.com", 2022),
//			    new JobSeekers("Suresh", 500000.0, "Python", "suresh@gmail.com", 2021),
//			    new JobSeekers("Mahesh", 600000.0, "Java", "mahesh@gmail.com", 2023),
//			    new JobSeekers("Anita", 300000.0, "React", "anita@gmail.com", 2020),
//			    new JobSeekers("Sunita", 700000.0, "Angular", "sunita@gmail.com", 2019),
//			    new JobSeekers("Pooja", 480000.0, "C++", "pooja@gmail.com", 2022),
//			    new JobSeekers("Rajesh", 550000.0, "JavaScript", "rajesh@gmail.com", 2021),
//			    new JobSeekers("Karan", 250000.0, "Java", "karan@gmail.com", 2023),
//			    new JobSeekers("Mohan", 520000.0, "Node.js", "mohan@gmail.com", 2020),
//			    new JobSeekers("Priya", 650000.0, "Vue.js", "priya@gmail.com", 2021),
//			    new JobSeekers("Arjun", 400000.0, "C#", "arjun@gmail.com", 2019),
//			    new JobSeekers("Lakshmi", 470000.0, "Oracle", "lakshmi@gmail.com", 2022),
//			    new JobSeekers("Vikram", 800000.0, "Spring Boot", "vikram@gmail.com", 2021),
//			    new JobSeekers("Deepak", 350000.0, "Hibernate", "deepak@gmail.com", 2020),
//			    new JobSeekers("Sneha", 900000.0, "MongoDB", "sneha@gmail.com", 2023),
//			    new JobSeekers("Kavita", 420000.0, "SQL", "kavita@gmail.com", 2022),
//			    new JobSeekers("Nisha", 750000.0, "AWS", "nisha@gmail.com", 2021),
//			    new JobSeekers("Amit", 620000.0, "Docker", "amit@gmail.com", 2020),
//			    new JobSeekers("Manish", 680000.0, "Kubernetes", "manish@gmail.com", 2021),
//			    new JobSeekers("Seema", 470000.0, "Microservices", "seema@gmail.com", 2022),
//			    new JobSeekers("Rahul", 550000.0, "Spring Cloud", "rahul@gmail.com", 2023),
//			    new JobSeekers("Alok", 260000.0, "Java", "alok@gmail.com", 2020),
//			    new JobSeekers("Geeta", 390000.0, "Python", "geeta@gmail.com", 2021),
//			    new JobSeekers("Ritu", 580000.0, "JavaScript", "ritu@gmail.com", 2019),
//			    new JobSeekers("Neha", 440000.0, "React", "neha@gmail.com", 2022),
//			    new JobSeekers("Vivek", 330000.0, "Angular", "vivek@gmail.com", 2020),
//			    new JobSeekers("Kiran", 710000.0, "C++", "kiran@gmail.com", 2021),
//			    new JobSeekers("Ajay", 500000.0, "Node.js", "ajay@gmail.com", 2023),
//			    new JobSeekers("Swati", 640000.0, "SQL", "swati@gmail.com", 2022),
//			    new JobSeekers("Anil", 380000.0, "Spring Boot", "anil@gmail.com", 2020)
//			);
//
//			repo.saveAll(jobSeekersList);

		try {
//			repo.showJsByCourse("Java", "C++", "SQL").forEach(System.out::println);
			
//			repo.showJsBySalaryRange(300000, 600000).forEach(rows ->{
//				for(Object row : rows) {
//					System.out.print(row+" ");
//				}
//				System.out.println();
//			});
			
//			repo.showJsBySalaryRange(300000, 600000).forEach(System.out::println);
			
//			Optional<Object[]> email = repo.showJsByEmail("anita@gmail.com");
//			if (email.isEmpty()) {
//			    System.out.println("No data found!!");
//			} else {
//			    Object[] data = email.get();   // one row with 4 columns
//			    
//			}
			
			
//			Optional<String> name = repo.showJsByEmail("anita@gmail.com");
//			if (name.isEmpty()) {
//			    System.out.println("No data found!!");
//			} else {
//			    System.out.println(name.get());			    
//			}
			
//			long count = repo.getJsUnitCount();
//			System.out.println("Total Number Of JobSeekers = "+count);
			
			Object[] data = (Object[])repo.getJsAggregateData();

			System.out.println("Total Records : " + data[0]);
			System.out.println("Max Salary    : " + data[1]);
			System.out.println("Min Salary    : " + data[2]);
			System.out.println("Avg Salary    : " + data[3]);

			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
