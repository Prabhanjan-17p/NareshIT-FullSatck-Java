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
public class SaveTestRunner implements CommandLineRunner {
	@Autowired
	private RestTemplate template;

	@Override
	public void run(String... args) throws Exception {
		String endPointUrl = "http://localhost:8899/Boot_REST-Proj09-Actor_API-MiniProject/showAll";
		//Json Body Content 
		String json_body ="{\n" +
		        "  \"aname\": \"Mahesh Babu\",\n" +
		        "  \"addrs\": \"Hyderabad\",\n" +
		        "  \"remuneration\": 175000000.0,\n" +
		        "  \"dob\": \"1975-08-09\"\n" +
		        "}";
		//prepare http headers
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		//prepare HttpEntity object having headers, body
		HttpEntity<String> entity = new HttpEntity<String>(json_body,headers);
		//consume the endPoint 
		ResponseEntity<String> resp = template.exchange(endPointUrl, HttpMethod.POST, entity, String.class);
		System.out.println("Result :: "+resp.getBody());
		System.out.println("Status Code :: "+resp.getStatusCode());
		System.out.println("Header Data :: "+resp.getHeaders());
		System.out.println("=================================");
		//Convert Java Object into Json Object
		ActorVO vo = new ActorVO();
		vo.setAname("Allia"); vo.setAddrs("Hyd"); vo.setDob(LocalDate.of(1987, 12, 14)); vo.setRemuneration(1222222222.0);
		ObjectMapper mapper = new ObjectMapper();
		String json_body1 = mapper.writeValueAsString(vo);
	}

}
