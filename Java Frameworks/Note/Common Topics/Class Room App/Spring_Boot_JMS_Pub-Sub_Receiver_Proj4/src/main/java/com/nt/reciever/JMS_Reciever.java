package com.nt.reciever;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.nt.model.Student;

@Component
public class JMS_Reciever {
	
	@JmsListener(destination = "objmq")
	public void readMessageConsumer(Student std) {
		System.out.println("Recieved Message :: "+std);
	}
}
