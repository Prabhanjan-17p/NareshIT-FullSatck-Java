package com.nt.send;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.nt.model.Employee;

@Component
public class KafkaMessageObjProducer implements CommandLineRunner {
	
	@Autowired
	public KafkaTemplate<String, Employee> template;
	
	@Value("${tpc.name}")
	public String tpcName;

	@Override
	public void run(String... args) throws Exception 
	{
		Employee e1=new Employee(1,"kanha",56.0f);
		template.send(tpcName, e1);

	}

}
