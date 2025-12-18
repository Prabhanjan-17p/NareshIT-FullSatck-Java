package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.nt.vo.ActorVO;

import tools.jackson.databind.ObjectMapper;

//@Component
public class FindByIdTestRunner implements CommandLineRunner {
	@Autowired
	private RestTemplate template;

	@Override
	public void run(String... args) throws Exception {
		String endPointUrl = "http://localhost:8899/Boot_REST-Proj09-Actor_API-MiniProject/find/{id}";
		//Consume the endPoint
		ResponseEntity<String> resp = template.getForEntity(endPointUrl, String.class, 2);
		//Get The Result
		String json_content = resp.getBody();
		System.out.println("Result :: "+json_content);
		System.out.println("Status Code :: "+resp.getStatusCode());
		System.out.println("Header Data :: "+resp.getHeaders());
		System.out.println("=================================");
		String json_content1 = template.getForObject(endPointUrl, String.class, 2);
		System.out.println("Result :: "+json_content1);
		System.out.println("=================================");
		//converting json content into Java Bean class obj using json api
		ObjectMapper mapper = new ObjectMapper();
		ActorVO vo = mapper.readValue(json_content1, ActorVO.class);
		System.out.println("VO Object Data :: "+vo);
		System.out.println("=================================");
		ResponseEntity<String> resp1 = template.exchange(endPointUrl, HttpMethod.GET, null, String.class, 2);
		System.out.println("Result :: "+resp1.getBody());
		System.out.println("Status Code :: "+resp1.getStatusCode());
		System.out.println("Header Data :: "+resp1.getHeaders());
		System.out.println("=================================");
		ResponseEntity<ActorVO> resp2 = template.exchange(endPointUrl, HttpMethod.GET, null, ActorVO.class, 2); 
		ActorVO vo1 = resp2.getBody();
		System.out.println("Result :: "+vo1);
		System.out.println("Status Code :: "+resp2.getStatusCode());
		System.out.println("Header Data :: "+resp2.getHeaders());
		System.out.println("=================================");
		ResponseEntity<ActorVO> resp3 = template.getForEntity(endPointUrl, ActorVO.class, 2); 
		ActorVO vo2 = resp3.getBody();
		System.out.println("Result :: "+vo2);
		System.out.println("Status Code :: "+resp3.getStatusCode());
		System.out.println("Header Data :: "+resp3.getHeaders());
	
	}

}
