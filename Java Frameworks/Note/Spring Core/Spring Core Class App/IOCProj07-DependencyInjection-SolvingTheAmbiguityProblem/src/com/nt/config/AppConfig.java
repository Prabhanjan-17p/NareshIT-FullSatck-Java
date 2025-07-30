//AppConfig.java
package com.nt.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.nt.sbeans")
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig:: 0-param constructor");
	}
	
	@Bean(name="ldate")
	public  LocalDate  createLDate() {
		System.out.println("AppConfig.createLDate()");
		return   LocalDate.now();
	}
	@Bean(name="ldate1")
	//@Primary
	public   LocalDate createLDate1() {
		System.out.println("AppConfig.createLDate1()");
		return LocalDate.of(2020,10,24);
	}
	
	@Bean(name="ldate2")
	public   LocalDate createLDate2() {
		System.out.println("AppConfig.createLDate2()");
		return LocalDate.of(2023,10,24);
	}

	
	@Bean(name="ldate3")
	public   LocalDate createLDate3() {
		System.out.println("AppConfig.createLDate3()");
		return LocalDate.of(2022,10,24);
	}
	


}
