//VotingEglibilityCheck.java
package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.nt.config.AppConfig;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("vec")
public class VotingEglibilityCheck {

    private final AppConfig appConfig;
	@Value("${voter.id}")
	private  Integer id;
	@Value("${voter.name}")
	private  String  name;
	@Value("${voter.age}")
	private  Float age;
	private   LocalDate  dov;
	
	public VotingEglibilityCheck(AppConfig appConfig) {
		System.out.println("VotingEglibilityCheck:: 0-param constructor");
		this.appConfig = appConfig;
	}
	
	@PostConstruct
	public  void  myInit() {
		System.out.println("VotingEglibilityCheck.myInit()");
		//initialise  left over properties
		dov=LocalDate.now();
		//check weather important proeprties  are injected with  valid  values or not
		if(age<0 || name==null || name.equalsIgnoreCase("") || name.length()==0)
			throw new IllegalArgumentException("Invalid inputs (age ,name)");
		
	}
	
	@PreDestroy
	public void  myDestroy() {
		System.out.println("VotingEglibilityCheck.myDestroy()");
		//nullifying the bean properties
		name=null;
		dov=null;
		id=null;
		age=null;
	}
	
	
	//b.method
	public  String checkElgibility() {
		System.out.println("VotingEglibilityCheck.checkElgibility() (b.method)");
		if(age<18)
			return "Mr/Miss/Mrs."+name+"  u r not elgible for voting";
		else
			return "Mr/Miss/Mrs."+name+"  u r  elgible for voting";
	}
	

}
