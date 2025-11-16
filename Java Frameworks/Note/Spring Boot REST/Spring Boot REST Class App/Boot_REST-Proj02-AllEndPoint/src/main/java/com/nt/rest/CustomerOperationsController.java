package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-api")
public class CustomerOperationsController {

	@GetMapping("/report")
	public ResponseEntity<String> showAllCustomer() {
		System.out.println("CustomerOperationsController.showAllCustomer()");
		return new ResponseEntity<String>("Showin all Customers Info", HttpStatus.OK);
	}

	@PostMapping("/save")
	public ResponseEntity<String> saveCustomer() {
		System.out.println("CustomerOperationsController.saveCustomer()");
		return new ResponseEntity<String>("Customers Is Created", HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateCustome(){
		System.out.println("CustomerOperationsController.updateCustome()");
		return new ResponseEntity<String>("Customer Upadte", HttpStatus.OK);
	}
	
	@PatchMapping("/updateEmail")
	public ResponseEntity<String> updateCustomerEmail(){
		System.out.println("CustomerOperationsController.updateCustomerEmail()");
		return new ResponseEntity<String>("Customer Email Upadte", HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteCutomer(){
		return new ResponseEntity<String>("Customer Data Delete", HttpStatus.OK);
	}
}
