package com.nt.sender;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.Session;

@Component
public class MOMs_Software_Send_MSG implements CommandLineRunner  {
	@Autowired
	private JmsTemplate template;

	@Override
	public void run(String... args) throws Exception {
//		//Using anonymous inner class logic 
//		template.send("testmq1",new MessageCreator() {
//			
//			@Override
//			public Message createMessage(Session session) throws JMSException {
//				Message message = session.createTextMessage("From sender at :: "+new Date());
//				return message;
//			}
//		});
//		
//		//Using Lambda 
//		template.send("test1mq1",session ->{
//			return session.createTextMessage("From sender at :: "+new Date());
//		});
		
		//More Flexible
		template.send("testmq1",session -> session.createTextMessage("From sender at :: "+new Date()));
		System.out.println("Message Sent");
	}
	
	
}
