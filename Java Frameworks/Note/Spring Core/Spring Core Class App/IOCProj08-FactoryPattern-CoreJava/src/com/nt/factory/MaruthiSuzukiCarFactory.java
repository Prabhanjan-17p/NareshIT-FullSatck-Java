//MaruthiSuzukiCarFactory.java (Factory Pattern class)
package com.nt.factory;

import com.nt.comps.BalenoCar;
import com.nt.comps.GrandVitaraCar;
import com.nt.comps.ICar;
import com.nt.comps.SwiftCar;

public interface MaruthiSuzukiCarFactory {
	
	//static  factory  method having factory pattern logic (retruning  one of the several related class objs)
	public  static   ICar    getInstance(String model) {
		System.out.println("MaruthiSuzukiCarFactory.getInstance()");
		ICar   car=null;
		if(model.equalsIgnoreCase("baleno"))
			car=new BalenoCar();
		else if(model.equalsIgnoreCase("swift"))
			car=new SwiftCar();
		else if(model.equalsIgnoreCase("vitara"))
			car=new GrandVitaraCar();
		else
			throw new IllegalArgumentException("Invalid Car Model");
		//return the object
		return car;
	}

}
