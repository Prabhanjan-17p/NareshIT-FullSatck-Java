package com.nt.model;

import lombok.Data;

@Data
public class Employee {
	private Integer eid;
	private String ename;
	private String desg;
	private Double salary;
	private Double grossSalary;
	private Double netSalary;
}
