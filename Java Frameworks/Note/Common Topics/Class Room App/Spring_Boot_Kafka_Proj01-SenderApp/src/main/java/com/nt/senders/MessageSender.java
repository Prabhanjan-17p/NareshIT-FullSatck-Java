package com.nt.senders;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender implements CommandLineRunner {
	@Autowired
	private KafkaTemplate<String, String> template;
	@Value("${tpc.name}")
	private String topic;

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String msg = null;
		do {
			System.out.print("Writer your massege :: ");
			msg = sc.nextLine();
			template.send(topic, msg);
		} while (!msg.equals("end"));
	}

}
