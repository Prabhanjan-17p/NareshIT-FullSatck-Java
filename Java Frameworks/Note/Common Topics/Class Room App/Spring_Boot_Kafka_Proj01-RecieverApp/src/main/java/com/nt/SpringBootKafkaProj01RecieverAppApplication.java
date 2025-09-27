package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SpringBootKafkaProj01RecieverAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaProj01RecieverAppApplication.class, args);
	}

}
