//BalenoCar.java
package com.nt.comps;

public class BalenoCar implements ICar {
	
	public BalenoCar() {
		System.out.println("BalenoCar:: 0-param constructor");
	}

	@Override
	public void makeCar() {
		System.out.println("BalenoCar::makeCar() ---> Manifacturing BalenoCar");
	}

	@Override
	public void testDrive() {
		System.out.println("BalenoCar.testDrive()---> test driving the Baleno Car");
	}

}
