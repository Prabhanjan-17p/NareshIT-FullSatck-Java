package com.nt.service;

public class SimpleIntrestCalculator {
	public double calSimpleIntrest(double pric,double rate,double time) {
		if(pric <= 0 || rate <= 0 || time<= 0) {
			throw new IllegalArgumentException();
		}
		
		double res = pric*rate*time/100.0;
		
		return res;
	}
}
