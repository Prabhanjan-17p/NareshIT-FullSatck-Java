//GrandVitaraCar.java
package com.nt.comps;

public class GrandVitaraCar implements ICar {
	
	public GrandVitaraCar() {
		System.out.println("GrandVitaraCar:: 0-param constructor");
	}

	@Override
	public void makeCar() {
		System.out.println("GrandVitaraCar::makeCar() ---> Manifacturing GrandVitaraCar");
	}

	@Override
	public void testDrive() {
		System.out.println("GrandVitaraCar.testDrive()---> test driving the  GrandVitaraCar");
	}

}
