package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.EmployeeService;

@Controller("payroll")
public class PayrollController {
	@Autowired
	private EmployeeService emp;
	
	public List<Employee> fetchByDesn(String s1,String s2,String s3) throws Exception{
		List<Employee> list = emp.fetchEmpByDesn(s1, s2, s3);
		return list;
	}
}
