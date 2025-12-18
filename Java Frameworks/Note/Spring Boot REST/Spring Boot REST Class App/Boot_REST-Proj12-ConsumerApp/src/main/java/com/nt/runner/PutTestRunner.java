package com.nt.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.nt.vo.ActorVO;

import tools.jackson.databind.ObjectMapper;

//@Component
public class PutTestRunner implements CommandLineRunner {
	@Autowired
	private RestTemplate template;

	@Override
	public void run(String... args) throws Exception {
		String endPointUrl = "http://localhost:8899/Boot_REST-Proj09-Actor_API-MiniProject/update";
		// prepare json content for request body
		ActorVO vo = new ActorVO();
		vo.setAid(2);
		vo.setAname("Allu Arjun");
		vo.setAddrs("Hyderabad");
		vo.setDob(LocalDate.of(1888, 9, 12));
		vo.setRemuneration(120.0);
		ObjectMapper mapper = new ObjectMapper();
		String json_body = mapper.writeValueAsString(vo);
		// prepare Http Headers
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		// prepare HttpEntity object having json body and headers
		HttpEntity<String> entity = new HttpEntity<String>(json_body, headers);

		// invoke the service
		ResponseEntity<String> resp = template.exchange(endPointUrl, HttpMethod.PUT, entity, String.class);
		// Get the result
		System.out.println("Response Status Code :: " + resp.getStatusCode());
		System.out.println("Response body(result) :: " + resp.getBody());

		System.exit(0);
	}

}
