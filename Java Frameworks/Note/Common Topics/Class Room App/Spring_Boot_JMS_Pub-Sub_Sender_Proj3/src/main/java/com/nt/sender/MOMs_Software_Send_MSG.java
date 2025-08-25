package com.nt.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.nt.model.Student;

@Component
public class MOMs_Software_Send_MSG {

    @Autowired
    private JmsTemplate template;

    @Scheduled(cron = "0/20 * * * * *")
    public void sendMessage() {
        Student s1 = new Student(101, "Kanha Amanta", 22, "kanha12345@gmail.com");
        System.out.println("Sending: " + s1);
        template.convertAndSend("objmq", s1);
        System.out.println("Message Sent");
    }
}
