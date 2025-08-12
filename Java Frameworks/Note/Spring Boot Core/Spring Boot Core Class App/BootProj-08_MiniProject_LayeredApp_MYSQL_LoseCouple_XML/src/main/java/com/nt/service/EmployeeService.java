package com.nt.service;

import java.util.List;

import com.nt.model.Employee;

public interface EmployeeService {
	public List<Employee> fetchEmpByDesn(String desn1,String desn2,String desn3) throws Exception;
	
	public String insertEmpDetails(String name,String job,double sal) throws Exception;
}
