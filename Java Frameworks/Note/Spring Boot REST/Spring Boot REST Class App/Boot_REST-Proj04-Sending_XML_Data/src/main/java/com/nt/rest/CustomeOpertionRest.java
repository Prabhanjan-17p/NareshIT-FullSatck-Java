package com.nt.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Company;
import com.nt.model.Customer;

@RestController
@RequestMapping("/cust-api")
public class CustomeOpertionRest {
	
	@GetMapping("/data")
	public ResponseEntity<Customer> showCustomerData(){
		System.out.println("CustomeOpertionRest.showAllCustomerData()");
		Customer cust = new Customer(101, "Raja", 4500.0f);
		
		return new ResponseEntity<Customer>(cust, HttpStatus.OK);
	}
	
	@GetMapping("/company-data")
	public ResponseEntity<Company> showAllCompanyData(){
		System.out.println("CustomeOpertionRest.showAllCompanyData()");
		Company com = new Company();
		com.setCid(120); com.setCname("ABC"); com.setCaddrs("Hyderabad");
		com.setBranches(new String[] {"Hyderabad","Odisha","Delhi"});
		com.setPhone(Set.of(11111111L,22222222L,33333333L));
		com.setProducts(List.of("IT","DML","BANK"));
		com.setDetails(Map.of("panno",12345,"gstno",33333,"TNT",898989));
		return new ResponseEntity<Company>(com, HttpStatus.OK);
	}
	
	@GetMapping("/all-data")
	public ResponseEntity<List<Customer>> showAllCustomerData(){
		System.out.println("CustomeOpertionRest.showAllCustomerData()");
		Customer cust1 = new Customer(101, "Raja", 4500.0f);
		Customer cust2 = new Customer(102, "Rani", 99900.0f);
		Customer cust3 = new Customer(103, "Hero", 4500.0f);
		Customer cust4 = new Customer(104, "Mohan", 2500.0f);
		Customer cust5 = new Customer(105, "Kisan", 7500.0f);
		
		List<Customer> cust = new ArrayList<Customer>(List.of(cust1,cust2,cust3,cust4,cust5));	

		
		return new ResponseEntity<List<Customer>>(cust,HttpStatus.OK);
	}
}
