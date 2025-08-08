package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empSer")
public class EmployeeServiceIMPL implements EmployeeService {
	@Autowired
	@Qualifier("iImpMysql")
	private IEmployeeDAO emp;

	@Override
	public List<Employee> fetchEmpByDesn(String desn1, String desn2, String desn3) throws Exception{
		String s1 = desn1.toUpperCase();
		String s2 = desn2.toUpperCase();
		String s3 = desn3.toUpperCase();
		
		List<Employee> list = emp.getEmpDetails(s1, s2, s3);
		
		list.forEach(em -> {
			em.setGrossSalary(em.getSalary()+(em.getSalary()*0.5));	
			em.setNetSalary(em.getGrossSalary()-(em.getGrossSalary()*0.2));
		});
		
		return list;
	}

	
	@Override
	public String insertEmpDetails(String name, String job, double sal) throws Exception {
		name = name.toUpperCase();
		job = job.toUpperCase();
		int insertEmpDetails = emp.insertEmpDetails(name, job, sal);
		return insertEmpDetails == 1?"Insert Successfull":"Please Try Agin!!!";
	}

}
