package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
}
