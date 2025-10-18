package com.nt.runner;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Department;
import com.nt.entity.Employee;
import com.nt.service.IDepartmentMgmtService;

import jakarta.transaction.Transactional;

@Component
public class OneToManyTestRunner implements CommandLineRunner {
	@Autowired
	private IDepartmentMgmtService service;
	
	@Override
	@Transactional
	public void run(String... args) throws Exception {
		/*Department deprt = new Department("HR", "ODISHA");
		Employee emp1 = new Employee("Sami", 123456.0f, "IT");
		Employee emp2 = new Employee("Arman", 654321.0f, "ACC");
		
		//Setting the Employee Details in Department class
		deprt.setEmpDetails(Set.of(emp1,emp2));
		
		//Setting the Department details into Employee class
		emp1.setDept(deprt);		
		emp2.setDept(deprt);
		
		try {
			String department = service.saveDepartment(deprt);
			System.out.println(department);
		} catch (Exception e) {
			e.printStackTrace();
		} */
		
		/* Department dept2 = new Department("Testing", "Ahmedabad");

		Employee emp3 = new Employee("Rahul", 600000.0f, "Admin Officer");
		Employee emp4 = new Employee("Tanya", 490000.0f, "QA Engineer");

		dept2.setEmpDetails(new HashSet<>(Arrays.asList(emp3, emp4)));

		emp3.setDept(dept2);
		emp4.setDept(dept2);

		List<Employee> emps = new ArrayList<>();
		emps.add(emp3);
		emps.add(emp4);

		try {
		    String department = service.saveEmployees(emps);
		    System.out.println(department);
		} catch (Exception e) {
		    e.printStackTrace();
		} */
		
		/* List<Department> listDept = service.findAllDataOfDepartmentPointToEmployee();
		listDept.forEach(dept ->{
			System.out.println(" Department: "+dept);
			System.out.println("--------------");
		    // Fetch and display employees of this department
		    Set<Employee> empSet = dept.getEmpDetails();
		    if (empSet != null && !empSet.isEmpty()) {
		        empSet.forEach(emp -> System.out.println("  Employee: " + emp));
		    } else {
		        System.out.println("  No employees found for this department.");
		    }
		    
		    System.out.println("================");
		}); */
		
		List<Employee> listEmp = service.findAllDataOfEmployeePointToDepartment();
		listEmp.forEach(emp->{
			System.out.println(emp);
			System.out.println("--------------");
			Department dept = emp.getDept();
			System.out.println(dept);
			System.out.println("===================");			
		});

		

		
	}

}
