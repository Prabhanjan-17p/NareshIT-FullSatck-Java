package com.nt.runner;

import java.util.Arrays;
import java.util.List;

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
			// 1
//			 List<JobSeekers> jobSeekersList = Arrays.asList(new
//			 JobSeekers("Rahul Sharma", 450000.0, "Java", 2020), new
//			 JobSeekers("Anita Verma", 380000.0, "Python", 2021), new
//			 JobSeekers("Suresh Kumar", 500000.0, "ReactJS", 2019), new
//			 JobSeekers("Priya Das", 420000.0, "Angular", 2020), new
//			 JobSeekers("Amit Mishra", 460000.0, "Spring Boot", 2021), new
//			 JobSeekers("Kiran Reddy", 350000.0, "NodeJS", 2018), new
//			 JobSeekers("Manish Gupta", 600000.0, "Full Stack", 2019), new
//			 JobSeekers("Sneha Patil", 400000.0, "Java", 2021), new
//			 JobSeekers("Vikram Singh", 550000.0, "Python", 2020), new
//			 JobSeekers("Neha Kapoor", 370000.0, "Data Science", 2022), new
//			 JobSeekers("Rohit Jain", 480000.0, "Machine Learning", 2020), new
//			 JobSeekers("Pooja Sahu", 390000.0, "HTML/CSS", 2019), new
//			 JobSeekers("Abhishek Yadav", 520000.0, "Java", 2021), new
//			 JobSeekers("Sunita Nair", 410000.0, "ReactJS", 2020), new
//			 JobSeekers("Deepak Mehta", 470000.0, "Python", 2019), new
//			 JobSeekers("Shalini Roy", 360000.0, "C++", 2022), new
//			 JobSeekers("Rajesh Kumar", 580000.0, "Spring Boot", 2021), new
//			 JobSeekers("Komal Pandey", 430000.0, "Angular", 2019), new
//			 JobSeekers("Gaurav Sharma", 490000.0, "Full Stack", 2020), new
//			 JobSeekers("Meena Iyer", 420000.0, "Java", 2022), new
//			 JobSeekers("Nikhil Jain", 510000.0, "Python", 2019), new
//			 JobSeekers("Divya Rani", 400000.0, "ReactJS", 2021), new
//			 JobSeekers("Ajay Kumar", 450000.0, "Machine Learning", 2020), new
//			 JobSeekers("Kavita Singh", 370000.0, "Data Science", 2021), new
//			 JobSeekers("Harsh Vardhan", 600000.0, "Java", 2020), new
//			 JobSeekers("Preeti Chauhan", 390000.0, "HTML/CSS", 2018), new
//			 JobSeekers("Sanjay Patel", 480000.0, "C++", 2019), new
//			 JobSeekers("Anjali Sharma", 420000.0, "Spring Boot", 2021), new
//			 JobSeekers("Tarun Malhotra", 530000.0, "Full Stack", 2022), new
//			 JobSeekers("Ritika Sen", 350000.0, "NodeJS", 2020));
//			 
//			 String saveAllJobSeeker = service.saveAllJobSeeker(jobSeekersList);
//			 System.out.println(saveAllJobSeeker);
			
			
//			String batch = service.removeJobSeekersInBatch(List.of(1031,1032));
//			System.out.println(batch);
			
			
//			JobSeekers js = new JobSeekers();
//			js.setCourse("java");//js.setSalary(400000.0);
//			List<JobSeekers> data = service.searchJobSeekerByData(js, true, "name");
//			data.forEach(System.out::println);
			
//			JobSeekers id = service.fetchJSByID(1057);
//			System.out.println(id);
			
			JobSeekers proxy = service.showByID(1057);
			System.out.println("Proxy obj class name :: "+proxy.getClass()+"----"+proxy.getClass().getSuperclass());
			System.out.println(proxy);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
