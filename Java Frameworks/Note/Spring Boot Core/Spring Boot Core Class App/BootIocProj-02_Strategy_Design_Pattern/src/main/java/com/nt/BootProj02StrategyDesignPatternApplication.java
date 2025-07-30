package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbean.Vehicle;

@SpringBootApplication
public class BootProj02StrategyDesignPatternApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext context = SpringApplication.run(BootProj02StrategyDesignPatternApplication.class, args);) {
			Vehicle vehicle = context.getBean(Vehicle.class);
			vehicle.journey("Odish", "Hyderabad");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
