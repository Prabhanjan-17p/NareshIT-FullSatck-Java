package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableConfigServer
@Slf4j
public class BootMsProj11ConfigServerExternalApplication {

	public static void main(String[] args) {
		log.debug("Start of main Config-Server");
		SpringApplication.run(BootMsProj11ConfigServerExternalApplication.class, args);
		log.debug("Start of main Config-Server");
	}

}
