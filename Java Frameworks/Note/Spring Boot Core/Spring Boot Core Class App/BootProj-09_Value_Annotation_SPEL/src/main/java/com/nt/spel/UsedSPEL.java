package com.nt.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.sbean.Student;

@Component("spel")
public class UsedSPEL {
	@Value("#{stu}")
	private Student std;
	
	@Value("#{stu.javafee+stu.springfee+stu.oraclefee+stu.reactfee+stu.advjavafee}")
	private double totfee;
	
	public void show() {
		System.out.println("Total Fees :: "+totfee+" \n"+std);
	}
}
