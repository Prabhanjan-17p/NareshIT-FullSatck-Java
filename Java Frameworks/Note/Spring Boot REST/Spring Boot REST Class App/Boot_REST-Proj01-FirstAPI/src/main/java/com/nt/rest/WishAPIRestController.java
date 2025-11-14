package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wish-api")
public class WishAPIRestController {

	public ResponseEntity<String> showMSG(){
		
		return new ResponseEntity<String>("Good Morning.", HttpStatus.OK) ;
	}
}
