package com.nt.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Company;
import com.nt.model.Customer;

@RestController
@RequestMapping("/cust-api")
public class CustomerOperationController {
	
	@PostMapping("/register-customer")
	public ResponseEntity<String> registerOneCustomer(@RequestBody Customer cust){
		System.out.println("CustomerOperationController.registerOneCustomer() :: "+cust);
		return new ResponseEntity<String>(cust.toString(),HttpStatus.CREATED);
	}
	
	@PostMapping("/register-company")
	public ResponseEntity<String> registerOneCompany(@RequestBody Company company){
		System.out.println("CustomerOperationController.registerOneCompany() :: "+company);
		return new ResponseEntity<String>(company.toString(),HttpStatus.CREATED);
	}
	
	@PostMapping("/register-allCustomer")
	public ResponseEntity<String> registerAllCustomer(@RequestBody List<Customer> cust){
		System.out.println("CustomerOperationController.registerOneCustomer() :: "+cust);
		return new ResponseEntity<String>(cust.toString(),HttpStatus.CREATED);
	}
	
	@PostMapping("/register-allCompany")
	public ResponseEntity<String> registerAllCompany(@RequestBody List<Company> company){
		System.out.println("CustomerOperationController.registerOneCompany() :: "+company);
		return new ResponseEntity<String>(company.toString(),HttpStatus.CREATED);
	}
}
