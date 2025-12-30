package com.nt.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.IBillMSInvokerClient;

@RestController
@RequestMapping("/cart")
@RefreshScope
public class CartOperationsMS {
	
	@Autowired
	private IBillMSInvokerClient client;
	
	@Value("${db.user}")
	private String user;
	
	@Value("${db.pass}")
	private String pass;
	
	@GetMapping("/sell")
	public ResponseEntity<String> doShopping()
	
	{
		System.out.println(client.getClass());
		String sourceMsg="shirt,troser,Hat items are purchased";
		
		//invoke provider MS through client comp
		
		String destMsg=client.invokeDoBilling().getBody();
		
		return new ResponseEntity<String>(sourceMsg+"USER:: "+user+"PASS:: "+pass+"%%%%%%%%%%%%%%"+destMsg,HttpStatus.OK);
	}

}
