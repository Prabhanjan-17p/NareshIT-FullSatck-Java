package com.nt.runners;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class TestAppliactionRunner implements ApplicationRunner,Ordered {

	@Override
	@Order(9)
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("============================");
		System.out.println("ApplicationRunner:");
		List<String> nonOptionArgs = args.getNonOptionArgs();
		System.out.println(nonOptionArgs);
		Set<String> optionNames = args.getOptionNames();
		optionNames.stream().forEach(name -> System.out.println(name + " ..... " + args.getOptionValues(name)));
		System.out.println("============================");
	}

	//This is get high priority 
	@Override
	public int getOrder() {
		return -1;
	}

}
