package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("petrol")
public class PetrolEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("PetrolEngine Started!!!");
	}

	@Override
	public void stopEngine() {
		System.out.println("PetrolEngine Stop!!!");
	}

}
