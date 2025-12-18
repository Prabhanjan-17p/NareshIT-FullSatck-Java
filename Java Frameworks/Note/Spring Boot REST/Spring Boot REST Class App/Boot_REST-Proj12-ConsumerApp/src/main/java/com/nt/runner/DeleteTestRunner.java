package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DeleteTestRunner implements CommandLineRunner {
	@Autowired
	private RestTemplate template;

	@Override
	public void run(String... args) throws Exception {
		String endPointUrl = "http://localhost:8899/Boot_REST-Proj09-Actor_API-MiniProject/delete/{start}/{end}";

		// invoke the service
		ResponseEntity<String> resp = template.exchange(endPointUrl, HttpMethod.DELETE, null, String.class, 100, 120);
		// Get the result
		System.out.println("Response Status Code :: " + resp.getStatusCode());
		System.out.println("Response body(result) :: " + resp.getBody());

		System.exit(0);
	}

}
