package com.nt.reciever;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.nt.model.CarInfo;

@Component
public class SenderPart {
	@Autowired
	private KafkaTemplate<String, CarInfo> template;
	@Value("${tpc.name}")
	private String topic;

	@KafkaListener(topics = "${tpc.name}", groupId = "grp3")
	public void sendDetails(CarInfo car) {
		System.out.println(car);
	}

}
