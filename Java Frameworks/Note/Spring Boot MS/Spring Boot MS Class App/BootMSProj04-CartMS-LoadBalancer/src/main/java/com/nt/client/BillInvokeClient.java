package com.nt.client;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillInvokeClient {
	@Autowired
	private LoadBalancerClient client;
	
	public ResponseEntity<String> invokeDoBilling(){
		//get Provider MS instance having less load factor
		ServiceInstance SI = client.choose("BillingMS");
		// Gather endpoint details of Provider MS
		URI uri = SI.getUri();
		String endPoint = uri+"/BillingMS/billing-api/info";
		//use RestTemplate for invoking the endpoint
		RestTemplate template = new RestTemplate();
		ResponseEntity<String> resp = template.exchange(endPoint, HttpMethod.GET, null, String.class);
		return resp;
	}
}
