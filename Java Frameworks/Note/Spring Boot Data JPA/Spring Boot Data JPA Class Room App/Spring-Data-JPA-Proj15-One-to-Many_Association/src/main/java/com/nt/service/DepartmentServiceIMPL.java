package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Department;
import com.nt.entity.Employee;
import com.nt.repository.IDepartmentRepository;
import com.nt.repository.IEmployeeRepository;

@Service
public class DepartmentServiceIMPL implements IDepartmentMgmtService {
	@Autowired
	private IDepartmentRepository deptRepo;
	@Autowired
	private IEmployeeRepository empRepo;

	@Override
	public String saveDepartment(Department dept) {
		Integer did = deptRepo.save(dept).getDid();
		
		return "Data Insert Sucessfully having ID :: "+did;
	}

	@Override
	public String saveEmployees(List<Employee> emps) {
		List<Employee> allEmp = empRepo.saveAll(emps);
		return "Total Employees Inserted: " + allEmp.size();
	}

	@Override
	public List<Department> findAllDataOfDepartmentPointToEmployee() {
		
		return deptRepo.findAll();
	}

	@Override
	public List<Employee> findAllDataOfEmployeePointToDepartment() {
		
		return empRepo.findAll();
	}

}
