package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
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
			/*
			 * List<JobSeekers> jobSeekersList = Arrays.asList(new
			 * JobSeekers("Rahul Sharma", 450000.0, "Java", 2020), new
			 * JobSeekers("Anita Verma", 380000.0, "Python", 2021), new
			 * JobSeekers("Suresh Kumar", 500000.0, "ReactJS", 2019), new
			 * JobSeekers("Priya Das", 420000.0, "Angular", 2020), new
			 * JobSeekers("Amit Mishra", 460000.0, "Spring Boot", 2021), new
			 * JobSeekers("Kiran Reddy", 350000.0, "NodeJS", 2018), new
			 * JobSeekers("Manish Gupta", 600000.0, "Full Stack", 2019), new
			 * JobSeekers("Sneha Patil", 400000.0, "Java", 2021), new
			 * JobSeekers("Vikram Singh", 550000.0, "Python", 2020), new
			 * JobSeekers("Neha Kapoor", 370000.0, "Data Science", 2022), new
			 * JobSeekers("Rohit Jain", 480000.0, "Machine Learning", 2020), new
			 * JobSeekers("Pooja Sahu", 390000.0, "HTML/CSS", 2019), new
			 * JobSeekers("Abhishek Yadav", 520000.0, "Java", 2021), new
			 * JobSeekers("Sunita Nair", 410000.0, "ReactJS", 2020), new
			 * JobSeekers("Deepak Mehta", 470000.0, "Python", 2019), new
			 * JobSeekers("Shalini Roy", 360000.0, "C++", 2022), new
			 * JobSeekers("Rajesh Kumar", 580000.0, "Spring Boot", 2021), new
			 * JobSeekers("Komal Pandey", 430000.0, "Angular", 2019), new
			 * JobSeekers("Gaurav Sharma", 490000.0, "Full Stack", 2020), new
			 * JobSeekers("Meena Iyer", 420000.0, "Java", 2022), new
			 * JobSeekers("Nikhil Jain", 510000.0, "Python", 2019), new
			 * JobSeekers("Divya Rani", 400000.0, "ReactJS", 2021), new
			 * JobSeekers("Ajay Kumar", 450000.0, "Machine Learning", 2020), new
			 * JobSeekers("Kavita Singh", 370000.0, "Data Science", 2021), new
			 * JobSeekers("Harsh Vardhan", 600000.0, "Java", 2020), new
			 * JobSeekers("Preeti Chauhan", 390000.0, "HTML/CSS", 2018), new
			 * JobSeekers("Sanjay Patel", 480000.0, "C++", 2019), new
			 * JobSeekers("Anjali Sharma", 420000.0, "Spring Boot", 2021), new
			 * JobSeekers("Tarun Malhotra", 530000.0, "Full Stack", 2022), new
			 * JobSeekers("Ritika Sen", 350000.0, "NodeJS", 2020));
			 * 
			 * String saveAllJobSeeker = service.saveAllJobSeeker(jobSeekersList);
			 * System.out.println(saveAllJobSeeker);
			 */

			// 2- Show sorted data by name
//            service.showJobSeekerAsSorted(true, "name")
//            .forEach(System.out::println);
//			 service.showJobSeekerAsSorted(true, "name","salary")
//			  .forEach(System.out::println);
			System.out.println("===================================");

			// 3- showJsDetailsByPagination
			int pageNo = 0; // page index starts from 0
			int pageSize = 5; // number of records per page

			Page<JobSeekers> page = service.showJsDetailsByPagination(pageNo, pageSize);

			// print page information
			System.out.println("Page Number: " + page.getNumber());
			System.out.println("Page Size: " + page.getSize());
			System.out.println("Total Pages: " + page.getTotalPages());
			System.out.println("Total Records: " + page.getTotalElements());
			System.out.println("Has Next Page? " + page.hasNext());
			System.out.println("Has Previous Page? " + page.hasPrevious());
			System.out.println("Is First Page? " + page.isFirst());
			System.out.println("Is Last Page? " + page.isLast());

			// print job seekers from this page
			page.getContent().forEach(System.out::println);
			System.out.println("===================================");

			// 4- showJsDetailsByPaginationAndSorting
			int pageNo4 = 0; // first page (0-based)
			int pageSize4 = 5; // 5 records per page
			boolean ascOrder4 = true; // true for ASC, false for DESC
			String sortProperty4 = "name"; // sort by column (e.g., "name", "salary", "course", "year")

			Page<JobSeekers> page4 = service.showJsDetailsByPaginationAndSorting(pageNo4, pageSize4, ascOrder4,
					sortProperty4);

			// Page metadata
			System.out.println("Page Number     : " + page4.getNumber());
			System.out.println("Page Size       : " + page4.getSize());
			System.out.println("Total Pages     : " + page4.getTotalPages());
			System.out.println("Total Records   : " + page4.getTotalElements());
			System.out.println("Has Next Page?  : " + page4.hasNext());
			System.out.println("Has Previous?   : " + page4.hasPrevious());
			System.out.println("Is First Page?  : " + page4.isFirst());
			System.out.println("Is Last Page?   : " + page4.isLast());

			// Records in this page
			page4.getContent().forEach(System.out::println);
			System.out.println("======================================");

			// 5 - showAllPagesData
			int pageSize5 = 5; // how many records per page
			service.showAllPagesData(pageSize5);
			System.out.println("======================================");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
