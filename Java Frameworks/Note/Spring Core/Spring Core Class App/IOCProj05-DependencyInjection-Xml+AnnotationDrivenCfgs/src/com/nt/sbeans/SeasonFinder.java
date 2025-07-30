//SeasonFinder.java(target spring bean)
package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf") //sf is bean id
public  class SeasonFinder {
	private  LocalDate date; //HAS-A property
	private   LocalTime time; //HAS-A property
	
	private SeasonFinder() {
		System.out.println("SeasonFinder:: 0-param constructor (private)");
	}
	
	
	
	@Autowired
	public    SeasonFinder(LocalDate date) {
		System.out.println("SeasonFinder::1- parameterized constructor");
		this.date=date;
		}

	@Autowired
	public    SeasonFinder(LocalDate date,LocalTime time) {
		System.out.println("SeasonFinder:: 2- parameterized constructor");
		this.date=date;
		this.time=time;
	}
	
	/*	@Autowired
		public void  assignDate(LocalDate date) {
			System.out.println("SeasonFinder.assignDate()");
			this.date=date;
		}
		
		@Autowired
		public   void  putTime(LocalTime time) {
			System.out.println("SeasonFinder.putTime()");
			this.time=time;
		}
	*/
	//b.method
	public   String  showSeasonName() {
		System.out.println("SeasonFinder.showSeasonName()::"+date+"...."+time);
		//get current month value
		int month=date.getMonthValue();
		if(month>=3 && month<=6)
			return "Summer Season";
		else if(month>=7 && month<=9)
			return "Rainy Season";
		else
			return "Winter Season";
	}//method

}//class
