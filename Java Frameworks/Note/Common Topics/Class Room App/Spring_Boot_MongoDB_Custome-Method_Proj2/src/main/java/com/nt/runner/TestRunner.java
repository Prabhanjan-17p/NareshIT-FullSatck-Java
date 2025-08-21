package com.nt.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.IProductRepo;

@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private IProductRepo prodRepo;

	@Override
	public void run(String... args) throws Exception {
		// Test finder methods
		// prodRepo.findByName("Table").forEach(System.out::println);
		// prodRepo.findByPrice(65000).forEach(System.out::println);
		// prodRepo.findByPriceBetween(1000, 70000).forEach(System.out::println);

		// Test @Query method
		System.out.println("---- Test @Query method ----");
		// prodRepo.getPriceByData(800).forEach(doc ->
		// System.out.println(Arrays.toString(doc)));
//		prodRepo.getAllDataByName("AC").forEach(System.out::println);
//		prodRepo.getProductDataByPriceRange(100, 1000).forEach(System.out::println);
//		prodRepo.getByNameWithQnty("Table", 10).forEach(System.out::println);
		// Example: find all products whose name starts with "Ta" or contains "tab"
		// (case insensitive)
		prodRepo.getProductsByNamePattern("ta").forEach(System.out::println);
	}

}
