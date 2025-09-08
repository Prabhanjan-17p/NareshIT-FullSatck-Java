package com.nt.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

import com.nt.entity.Employees;

@Service
public class EmployeeProcessor implements ItemProcessor<Employees, Employees	> {

	@Override
	public Employees process(Employees emp) throws Exception {
		if (emp.getSalary() >= 500000) {
			emp.setGrossSaIary(emp.getSalary() + emp.getSalary()*0.4);
			emp.setNetSaIary(emp.getGrossSaIary() - emp.getGrossSaIary());
			return emp;
		}
		return null;
	}

}
