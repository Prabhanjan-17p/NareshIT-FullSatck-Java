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
			System.out.print("Enter Desgination 1 :: ");
			String s1 = sc.next();
			System.out.print("Enter Desgination 2 :: ");
			String s2 = sc.next();
			System.out.print("Enter Desgination 3 :: ");
			String s3 = sc.next();

			PayrollController pay = run.getBean(PayrollController.class);
			List<Employee> list = pay.fetchByDesn(s1, s2, s3);
			list.stream().forEach(System.out::println);
		} catch (Exception e) {
			System.out.println("Invalid Credential :: " + e.getMessage());
		}
	}

}
