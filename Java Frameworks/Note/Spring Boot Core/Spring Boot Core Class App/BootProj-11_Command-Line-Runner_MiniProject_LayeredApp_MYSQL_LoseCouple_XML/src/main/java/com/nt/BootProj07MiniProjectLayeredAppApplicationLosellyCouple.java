package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.controller.PayrollController;
import com.nt.model.Employee;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootProj07MiniProjectLayeredAppApplicationLosellyCouple {

	public static void main(String[] args) {
		SpringApplication.run(BootProj07MiniProjectLayeredAppApplicationLosellyCouple.class, args);
	}

}
