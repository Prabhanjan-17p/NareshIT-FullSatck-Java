package com.nt.sbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("stu")
public class Student {
	@Value("${std.name}")
	private String name;
	@Value("${std.javafee}")
	private double javafee;
	@Value("${std.oraclefee}")
	private double oraclefee;
	@Value("${std.reactfee}")
	private double reactfee;
	@Value("${std.advjavafee}")
	private double advjavafee;
	@Value("${std.springfee}")
	private double springfee;
}
