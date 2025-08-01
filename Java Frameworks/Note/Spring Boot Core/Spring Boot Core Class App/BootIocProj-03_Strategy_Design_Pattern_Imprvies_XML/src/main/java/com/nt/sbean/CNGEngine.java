package com.nt.sbean;

import org.springframework.stereotype.Component;

@Component("cng")
public class CNGEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("CNGEngine Started!!!");
	}

	@Override
	public void stopEngine() {
		System.out.println("CNGEngine Stop!!!");
	}

}
