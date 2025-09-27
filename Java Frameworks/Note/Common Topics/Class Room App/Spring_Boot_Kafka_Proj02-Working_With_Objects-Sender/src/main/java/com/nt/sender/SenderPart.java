package com.nt.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.nt.model.CarInfo;

@Component
public class SenderPart implements CommandLineRunner {
	@Autowired
	private KafkaTemplate<String, CarInfo> template;
	@Value("${tpc.name}")
	private String topic;

	@Override
	public void run(String... args) throws Exception {
		CarInfo car = new CarInfo("C101", "Tesla", "Model S", 2024, 85000.50);
		
		System.out.println(sendDetails(car));
	}
	
	public String sendDetails(CarInfo car) {
		template.send(topic, "car details", car);
		return "Massege sent successfully.";
	}

}
