//SpringBeanLifeCycleTest.jav
package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.VotingEglibilityCheck;

public class SpringBeanLifeCycleTest {

	public static void main(String[] args) {
		          //create  IOC container
		try(AnnotationConfigApplicationContext  ctx=new AnnotationConfigApplicationContext(AppConfig.class)){
			   //get  spring bean class obj ref
			  VotingEglibilityCheck check=ctx.getBean("vec", VotingEglibilityCheck.class);
			  System.out.println("result is :"+check.checkElgibility());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}//main

}//class
