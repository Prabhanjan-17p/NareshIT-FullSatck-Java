package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SpringBootKafkaProj02WorkingWithObjectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaProj02WorkingWithObjectsApplication.class, args);
	}

}
