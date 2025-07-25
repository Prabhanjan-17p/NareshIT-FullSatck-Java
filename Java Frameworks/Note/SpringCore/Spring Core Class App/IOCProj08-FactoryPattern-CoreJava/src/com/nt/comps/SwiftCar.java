//SwiftCar.java
package com.nt.comps;

public class SwiftCar implements ICar {
	
	public SwiftCar() {
		System.out.println("SwiftCar:: 0-param constructor");
	}

	@Override
	public void makeCar() {
		System.out.println("SwiftCar::makeCar() ---> Manifacturing SwiftCar");
	}

	@Override
	public void testDrive() {
		System.out.println("SwiftCar.testDrive()---> test driving the Swift Car");
	}

}
