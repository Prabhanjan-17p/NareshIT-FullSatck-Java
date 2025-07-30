package com.nt;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbean.SeasonFinder;

@SpringBootApplication
public class BootProj01DependencyInjectionApplication {
	
	@Bean(name = "id")
	public LocalDate date() {
		return LocalDate.now();
	}

	public static void main(String[] args) {
		try(ConfigurableApplicationContext context = SpringApplication.run(BootProj01DependencyInjectionApplication.class, args);){
			SeasonFinder finder = context.getBean(SeasonFinder.class);
			String season = finder.findSeason();
			System.out.println(season);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
