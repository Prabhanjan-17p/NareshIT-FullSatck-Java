package com.nt.client;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BillInvokeClient {
	@Autowired
	private DiscoveryClient client;
	
	public ResponseEntity<String> invokeDoBilling(){
		//get Provider MS instances
		List<ServiceInstance> listIns = client.getInstances("BillingMS");
		//get one Instance from listSl Explicitly
		ServiceInstance SI = listIns.get(0);
		// Gather endpoint details of Provider MS
		URI uri = SI.getUri();
		System.out.println("URI -- "+uri);
		String endPoint = uri+"/billing-api/info";
		System.out.println("endPoint -- "+endPoint);
		//use RestTemplate for invoking the endpoint
		RestTemplate template = new RestTemplate();
		ResponseEntity<String> resp = template.exchange(endPoint, HttpMethod.GET, null, String.class);
		return resp;
	}
}
