package com.nt.main;

import com.nt.comps.ICar;
import com.nt.factory.MaruthiSuzukiCarFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		ICar  car=MaruthiSuzukiCarFactory.getInstance("baleno");
		car.makeCar();
		car.testDrive();
		System.out.println("====================");
		ICar  car1=MaruthiSuzukiCarFactory.getInstance("vitara");
		car1.makeCar();
		car1.testDrive();
		System.out.println("=======================");
		}

}
