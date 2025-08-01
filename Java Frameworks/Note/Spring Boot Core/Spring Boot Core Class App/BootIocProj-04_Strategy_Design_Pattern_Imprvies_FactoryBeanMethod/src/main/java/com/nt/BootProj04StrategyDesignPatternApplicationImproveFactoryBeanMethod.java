package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbean.Vehicle;

@SpringBootApplication
public class BootProj04StrategyDesignPatternApplicationImproveFactoryBeanMethod {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext context = SpringApplication.run(BootProj04StrategyDesignPatternApplicationImproveFactoryBeanMethod.class, args);) {
			Vehicle vehicle = context.getBean(Vehicle.class);
			vehicle.journey("Odish", "Hyderabad");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
