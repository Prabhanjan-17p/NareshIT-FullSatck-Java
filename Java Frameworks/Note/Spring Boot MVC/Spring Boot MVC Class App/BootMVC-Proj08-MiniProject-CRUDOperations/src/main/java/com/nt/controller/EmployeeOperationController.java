package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.entity.EmployeeEntity;
import com.nt.service.IStudentMgmtService;
import com.nt.vo.EmployeeVO;

@Controller
public class EmployeeOperationController {
	@Autowired
	private IStudentMgmtService service;
	
	@GetMapping("/")
	public String showHomePage() {
		return "wellcome";
	}
	
	@GetMapping("/report")
	public String showReportPage(Map<String, Object> map) {
		List<EmployeeVO> allData = service.showAllData();
		map.put("empsList", allData);
		return "show_report";
	}
	
	@GetMapping("/emp_add")
	public String showFormForSaveEmployee(@ModelAttribute("emp") EmployeeEntity emp) {
		return "register_employee";
	}
	
	@PostMapping("/registerEmp")
	public String registerNewuser(@ModelAttribute("emp") EmployeeEntity emp, Map<String, Object> map) {
		String msg = service.registerEmployee(emp);
		List<EmployeeVO> list = service.showAllData();
		map.put("resultMSG", msg);
		map.put("empList", list);
		
		/*
		// Call service to register employee
	    String msg = service.registerEmployee(emp);

	    // Retrieve employee ID (assuming service sets it in entity or returns it)
	    int empId = emp.getEmpno();  // Adjust field name if different

	    // Fetch updated employee list
	    List<EmployeeVO> list = service.showAllData();

	    // Add data to map for JSP
	    map.put("resultMSG", msg);
	    map.put("empId", empId);
	    map.put("empList", list);

//		return "register_scucess";

 */
	    return "redirect:report";
	}
	

}
