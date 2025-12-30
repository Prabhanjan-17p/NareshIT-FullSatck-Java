package com.nt.ms;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bill")
@RefreshScope
public class BillingOperationsMS {
	@Value("${spring.application.instance-id}")
	private String instanceId;
	
	@Value("${db.user}")
	private String user;
	
	@Value("${db.pwd}")
	private String pass;
	
	@GetMapping("/info")
	public ResponseEntity<String> doBilling()
	{
		double bamt=new Random().nextDouble(100000);
		
		return new ResponseEntity<String>("Billamt::===>"+bamt+"USER::"+user+"---"+" PASS::"+pass+"====>"+instanceId,HttpStatus.OK);
	}

}
