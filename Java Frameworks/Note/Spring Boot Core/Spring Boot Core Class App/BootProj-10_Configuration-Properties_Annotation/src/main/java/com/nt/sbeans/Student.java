package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("stu")
@ConfigurationProperties(prefix = "std")
public class Student {
	private String name;
	private double javafee;
	private double oraclefee;
	private double reactfee;
	private double advjavafee;
	private double springfee;
}
