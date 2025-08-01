package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbean.Vehicle;

@SpringBootApplication
@ImportResource("com/nt/config/applicationContext.xml")
public class BootProj03StrategyDesignPatternApplicationImproveXML {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext context = SpringApplication.run(BootProj03StrategyDesignPatternApplicationImproveXML.class, args);) {
			Vehicle vehicle = context.getBean(Vehicle.class);
			vehicle.journey("Odish", "Hyderabad");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
