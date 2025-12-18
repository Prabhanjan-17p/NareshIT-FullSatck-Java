package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.nt.vo.ActorVO;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

//@Component
public class FindAllByIdTestRunner implements CommandLineRunner {
	@Autowired
	private RestTemplate template;

	@Override
	public void run(String... args) throws Exception {
		String endPointUrl = "http://localhost:8899/Boot_REST-Proj09-Actor_API-MiniProject/showAll";
		//Consume the endPoint
		ResponseEntity<String> resp = template.getForEntity(endPointUrl, String.class);
		//Get The Result
		String json_content = resp.getBody();
		System.out.println("Result :: "+json_content);
		System.out.println("Status Code :: "+resp.getStatusCode());
		System.out.println("Header Data :: "+resp.getHeaders());
		System.out.println("=================================");
		ResponseEntity<String> resp1 = template.exchange(endPointUrl, HttpMethod.GET, null, String.class);
		System.out.println("Result :: "+resp1.getBody());
		System.out.println("Status Code :: "+resp1.getStatusCode());
		System.out.println("Header Data :: "+resp1.getHeaders());
		//convert json content to List<ActorVO> class object
		ObjectMapper mapper = new ObjectMapper();
		List<ActorVO> listVO = mapper.readValue(json_content, new TypeReference<List<ActorVO>>() {});
		listVO.forEach(System.out::println);
	}

}
