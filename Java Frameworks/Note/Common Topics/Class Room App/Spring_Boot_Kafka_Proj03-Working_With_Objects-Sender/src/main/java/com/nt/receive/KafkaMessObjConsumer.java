package com.nt.receive;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import com.nt.model.Employee;

@Component
public class KafkaMessObjConsumer {
	
	@KafkaListener(topics = "${tpc.name}" ,groupId ="grp1")
	public void read(Employee emp)
	{
		System.out.println(emp);
	}
	

}
