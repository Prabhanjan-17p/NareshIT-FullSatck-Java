package com.nt.reciever;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageReciever {
	@Autowired
	private KafkaTemplate<String, String> template;
	
	@KafkaListener(topics = "${tpc.name}", groupId = "group3")
	public void readMassege(String msg) {
		System.out.println("Recieved MSG :: "+ msg);
	}
}
