package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class BootMsProj11BillingServiceApplication {

	public static void main(String[] args) {
		log.info("Start of Billing-MS");
		SpringApplication.run(BootMsProj11BillingServiceApplication.class, args);
		log.info("End of Billing-MS");
	}

}
