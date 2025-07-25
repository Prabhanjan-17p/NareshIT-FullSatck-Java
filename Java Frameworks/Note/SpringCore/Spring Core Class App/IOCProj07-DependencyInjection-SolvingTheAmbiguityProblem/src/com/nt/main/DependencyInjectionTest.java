//DependencyInjectionTest.java
package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WeekDayFinder;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		//create IOC container
	try(AnnotationConfigApplicationContext  ctx=
				  new AnnotationConfigApplicationContext(AppConfig.class);){
		//get target spring bean class  obj ref
		WeekDayFinder  finder=ctx.getBean("wf",WeekDayFinder.class);
		//invoke the b.method
		System.out.println("result ::"+finder.showGreetMessage("raja"));
	}//try
	catch(Exception e) {
		e.printStackTrace();
	}
			
	}//main

}//class
