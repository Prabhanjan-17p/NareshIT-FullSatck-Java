package com.nt.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient("BillingMS")
public interface IBillMSInvokerClient {
	
	@GetMapping("/BillingMS/bill/info")
	public ResponseEntity<String> invokeDoBilling();

}