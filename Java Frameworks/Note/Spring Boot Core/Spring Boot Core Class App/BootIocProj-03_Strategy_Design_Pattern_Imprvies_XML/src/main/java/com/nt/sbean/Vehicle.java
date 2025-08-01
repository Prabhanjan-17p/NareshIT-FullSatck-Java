package com.nt.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	@Autowired
	@Qualifier("eng")
	private IEngine engine;
	
	public void journey(String st,String end) {
		System.out.println("Journey Started :: "+st);
		engine.startEngine();
		System.out.println("Journey going on!!!");
		engine.stopEngine();
		System.out.println("Journey End :: "+end);
	}
	
}
