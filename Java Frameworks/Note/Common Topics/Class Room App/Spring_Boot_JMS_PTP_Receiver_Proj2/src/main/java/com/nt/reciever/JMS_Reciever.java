package com.nt.reciever;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JMS_Reciever {
	
	@JmsListener(destination = "testmq1")
	public void readMessageConsumer(String text) {
		System.out.println("Recieved Message :: "+text);
	}
}
