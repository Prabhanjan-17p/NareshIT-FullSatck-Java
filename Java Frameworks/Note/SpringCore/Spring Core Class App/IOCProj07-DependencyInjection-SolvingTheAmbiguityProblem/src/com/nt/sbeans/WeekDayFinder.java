//WeekDayFinder.java
package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wf")
public class WeekDayFinder {
	@Autowired  //Field Injection
	@Qualifier("ldate")
 private   LocalDate  date;
	
	
	//for  cosntructor inject
	@Autowired
	public  WeekDayFinder(@Qualifier("ldate1") LocalDate  date) {
		this.date=date;
	}
	
	
	//for arbitrary method injection
			@Autowired
			@Qualifier("ldate3")
			public   void putDate(LocalDate  date) {
				System.out.println("WeekDayFinder.putDate()");
				this.date=date;
			}
		
	
	 //for setter injection
	@Autowired
	@Qualifier("ldate2")
	public   void setDate(LocalDate  date) {
		System.out.println("WeekDayFinder.setDate()");
		this.date=date;
	}
	
	 	
	
	public WeekDayFinder() {
		System.out.println("WeekDayFinder:: 0-param constructor");
	}
	
	public  String  showGreetMessage(String name) {
		System.out.println("WeekDayFinder.showGreetMessage()::"+date);
		//get day of the week
		int week=date.getDayOfWeek().getValue();
		//generate the wish message
		if(week!=6 && week!=7)
			return  "Happy Working Day ,Working is Worshiping::"+name;
		else
			return  "Happy Weekend  , Enjoy your  Paid Holiday"+name;
	}
	
}
