package com.nt.service;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service("mailSend")
public class ProductBuyIMPL implements ProductBuy {

	@Autowired
	private JavaMailSender sendMail;
	
	@Value("${spring.mail.username}")
	private String fromMail;
	
	
	@Override
	public String allProduct(String[] items, double[] price, String[] mail) throws Exception {
		double totAmt =0;
		for(double p:price) totAmt+=p;
		
		String msg = Arrays.toString(items)+" With Prices "+Arrays.toString(price)+" Total Bill :: "+totAmt;
		
		String status =mailSendTo(msg,mail);
		return msg+" -----> "+status;
	}


	private String mailSendTo(String msg, String[] mail) throws Exception {
		MimeMessage message = sendMail.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message,true);
		helper.setFrom(fromMail);
		helper.setCc(mail);
		helper.setSubject("Testing Sending Message Through Spring Boot.");
		helper.setSentDate(new Date());
		helper.setText(msg);
		helper.addAttachment("gitProfile.png", new ClassPathResource("gitProfile.png"));
		sendMail.send(message);
		return "mail sent sucessfully done.";
	}

}
