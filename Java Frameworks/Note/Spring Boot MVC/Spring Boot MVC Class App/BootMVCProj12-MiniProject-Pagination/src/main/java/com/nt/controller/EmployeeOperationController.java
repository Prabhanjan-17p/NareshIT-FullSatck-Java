package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	@GetMapping("/page_report")
	public String showReportByPagination(Map<String, Object> map,
			@PageableDefault(page = 0, size = 3, sort = "desg", direction = Sort.Direction.ASC) Pageable pageable) {
		// use service
		Page<EmployeeVO> pageVO = service.showEmployeesByPagination(pageable);
		// keep the result in the shared memory
		map.put("pageData", pageVO);
		// return LVN
		return "show_page_report";
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
		 * // Call service to register employee String msg =
		 * service.registerEmployee(emp);
		 * 
		 * // Retrieve employee ID (assuming service sets it in entity or returns it)
		 * int empId = emp.getEmpno(); // Adjust field name if different
		 * 
		 * // Fetch updated employee list List<EmployeeVO> list = service.showAllData();
		 * 
		 * // Add data to map for JSP map.put("resultMSG", msg); map.put("empId",
		 * empId); map.put("empList", list);
		 * 
		 * // return "register_scucess";
		 * 
		 */
		return "redirect:report";
	}

	@GetMapping("/edit")
	public String showEditEmpPage(@RequestParam("no") int no, @ModelAttribute("emp") EmployeeVO emp) {
		EmployeeVO emp1 = service.getEmpByNo(no);
		BeanUtils.copyProperties(emp1, emp);

		return "edit_employee_form";
	}

	@PostMapping("/edit")
	public String editEmployee(@ModelAttribute("emp") EmployeeVO vo, RedirectAttributes attrs) {
		try {
			// use Service method
			String msg = service.editEmpData(vo);
			// keep result in FlashAttributes
			attrs.addFlashAttribute("resultMsg", msg);
			// redirect the request
			return "redirect:report";
		} catch (Exception e) {
			attrs.addFlashAttribute("resultMsg", "Problem in Edit Employee operation");
			return "redirect:report";
		}
	}

	@GetMapping("/delete")
	public String removeEmp(@RequestParam("no") int no, RedirectAttributes attrs) {
		try {
			// use service
			String msg = service.removeEmployeeById(no);
			// keep result as flash attribute
			attrs.addFlashAttribute("resultMsg", msg);
			// redirect the request
			return "redirect:report";
		} catch (Exception e) {
			attrs.addFlashAttribute("resultMsg", "Problem in delete operation");
			return "redirect:report";
		}
	}
}
