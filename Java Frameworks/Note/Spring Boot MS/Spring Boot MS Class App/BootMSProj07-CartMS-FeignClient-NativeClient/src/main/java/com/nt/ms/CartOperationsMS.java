package com.nt.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.IBillInvokeClient;


@RestController
@RequestMapping("/cart-api")
public class CartOperationsMS {

	@Autowired
	private IBillInvokeClient client;
	@Value("${db.user}")
	private String user;
	@Value("${db.password}")
	private String pwd;
	
	@GetMapping("/pur")
	public ResponseEntity<String> doShopping(){
		String item = "Shirt, Pant item are Purchase...";
		//invoke provider MS through client comp 1
		String msg = client.invokeDoBilling().getBody();
		//return the final result
		return new ResponseEntity<String>(item+" --- "+msg+" --- "+user+" --- "+pwd,HttpStatus.OK);
	}
	
}
