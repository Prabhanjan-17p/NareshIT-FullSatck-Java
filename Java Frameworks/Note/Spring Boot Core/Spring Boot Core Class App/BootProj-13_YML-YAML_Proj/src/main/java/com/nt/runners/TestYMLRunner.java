package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.sbean.Employee;

@Component
public class TestYMLRunner implements CommandLineRunner {
	@Autowired
	private Employee emp;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(emp);
	}

}
