package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling  // Enables Spring Boot's scheduling support
public class SpringBootScheduleProj01Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootScheduleProj01Application.class, args);
    }
}
