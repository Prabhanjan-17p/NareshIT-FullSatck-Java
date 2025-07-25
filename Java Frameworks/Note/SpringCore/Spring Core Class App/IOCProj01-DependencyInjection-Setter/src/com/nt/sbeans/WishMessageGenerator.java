//WishMessageGenerator.java
package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator {
	//HAS- A properties
	private LocalTime time;
	private  LocalDate  date;
	//simple properties
	private  int age;
	private  String  email;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:0-param consructor");
	}
	
	//setter method for setter Injection (alt+shift+s,r)
	public  void  setTime(LocalTime time) {
		System.out.println("WishMessageGenerator.setTime()");
		this.time=time;
	}
	
	public   void setDate(LocalDate date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date=date;
	}
	
	
	
	 
	public void setAge(int age) {
		System.out.println("WishMessageGenerator.setAge()");
		this.age = age;
	}

	public void setEmail(String email) {
		System.out.println("WishMessageGenerator.setEmail()");
		this.email = email;
	}

	//  develop the b.method
	public  String showWishMessage(String user) {
		System.out.println("WishMessageGenerator.showWishMessage()::"+time+"...."+date+"...."+age+"..."+email);
		// get  current hour of the day
		 int hour=time.getHour();
		 //generate the wish message
		  if(hour<12)
			   return "Good Morning::"+user;
		  else if(hour<16)
			  return  "Good Afternoon::"+user;
		  else if(hour<20)
			  return  "Good Evening::"+user;
		  else
			  return  "Good Night::"+user;
	}
	
	

}
