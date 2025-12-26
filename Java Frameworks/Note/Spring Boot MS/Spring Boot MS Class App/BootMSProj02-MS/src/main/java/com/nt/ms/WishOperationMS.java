package com.nt.ms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wish-api")
public class WishOperationMS {
	
	@Value("${spring.application.instance-id}")
	private String instanceId;
	
	@GetMapping("/msg")
	public ResponseEntity<String> showMSG(){
		return new ResponseEntity<String>("Good Morning :: "+instanceId, HttpStatus.OK);
	}
}
