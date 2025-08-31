package com.nt.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class TestCommandLineRunner implements CommandLineRunner,Ordered {

	@Override
	@Order(1)
	public void run(String... args) throws Exception {
		System.out.println("============================");
		System.out.println("CommandLineRunner: ");
//		System.out.println(Arrays.toString(args));
		Arrays.stream(args).forEach(arg -> System.out.print(arg + " "));
		System.out.println("\n============================");
	}

	
	@Override
	public int getOrder() {
		return -22;
	}

}
