package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("diesel")
public class DiselEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("DiselEngine Started!!!");
	}

	@Override
	public void stopEngine() {
		System.out.println("DiselEngine Stop!!!");
	}

}
