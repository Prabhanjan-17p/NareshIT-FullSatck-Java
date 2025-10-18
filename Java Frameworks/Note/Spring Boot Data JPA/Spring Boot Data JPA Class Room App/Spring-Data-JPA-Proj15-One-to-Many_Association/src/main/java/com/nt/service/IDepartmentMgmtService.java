package com.nt.service;

import java.util.List;

import com.nt.entity.Department;
import com.nt.entity.Employee;

public interface IDepartmentMgmtService {
	public String saveDepartment(Department dept);
	public String saveEmployees(List<Employee> dept);
	public List<Department> findAllDataOfDepartmentPointToEmployee(); 
	public List<Employee> findAllDataOfEmployeePointToDepartment(); 
}
