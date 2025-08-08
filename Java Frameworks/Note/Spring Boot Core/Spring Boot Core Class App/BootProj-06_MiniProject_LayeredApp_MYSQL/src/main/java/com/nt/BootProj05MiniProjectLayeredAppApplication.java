package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.PayrollController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj05MiniProjectLayeredAppApplication {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext run = SpringApplication
				.run(BootProj05MiniProjectLayeredAppApplication.class, args); Scanner sc = new Scanner(System.in)) {
			PayrollController pay = run.getBean(PayrollController.class);
			
			System.out.println(":: ======================== :: ");
			System.out.println("		1. Get Employee Details\n" + "		2. Insert Employee Details");
			System.out.print("Enter your Choice:: ");
			int key = sc.nextInt();
			
			switch (key) {
			case 1:
				System.out.print("Enter Desgination 1 :: ");
				String s1 = sc.next();
				System.out.print("Enter Desgination 2 :: ");
				String s2 = sc.next();
				System.out.print("Enter Desgination 3 :: ");
				String s3 = sc.next();

				List<Employee> list = pay.fetchByDesn(s1, s2, s3);
				list.stream().forEach(System.out::println);
				break;
			case 2:
				System.out.print("Enter Employee Name:: ");
				String name = sc.next();
				System.out.print("Enter Employee Job:: ");
				String job = sc.next();;
				System.out.print("Enter Employee Salary:: ");
				double sal = sc.nextDouble();
				
				try {
					String empDetails = pay.insertEmpDetails(name, job, sal);
					System.out.println(empDetails);
				} catch (Exception e) {
					throw e;
				}
				break;

			default:
				throw new Exception();
			}

		} catch (Exception e) {
			System.out.println("Invalid Credential :: " + e.getMessage());
		}
	}

}
