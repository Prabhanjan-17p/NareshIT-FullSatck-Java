package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SpringBootApacheKafkaObjectReceiveConsumer1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApacheKafkaObjectReceiveConsumer1Application.class, args);
	}

}
