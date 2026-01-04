package com.nt.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.IBillInvokeClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


@RestController
@RequestMapping("/cart-api")
public class CartOperationsMS {

	@Autowired
	private IBillInvokeClient client;
	
	@GetMapping("/pur")
	@CircuitBreaker(name="CartMS", fallbackMethod = "billingFallBack")
	public ResponseEntity<String> doShopping(){
		String item = "Shirt, Pant item are Purchase...";
		//invoke provider MS through client comp 1
		String msg = client.invokeDoBilling().getBody();
		//return the final result
		return new ResponseEntity<String>(item+" --- "+msg,HttpStatus.OK);
	}
	
	public ResponseEntity<String> billingFallBack(Exception e){
		return new ResponseEntity<String>("Problem in Billing Server", HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
