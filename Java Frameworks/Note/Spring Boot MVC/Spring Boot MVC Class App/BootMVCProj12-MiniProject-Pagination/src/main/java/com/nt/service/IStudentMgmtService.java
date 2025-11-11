package com.nt.service;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nt.entity.EmployeeEntity;
import com.nt.vo.EmployeeVO;

public interface IStudentMgmtService {
	List<EmployeeVO> showAllData();
	String registerEmployee(EmployeeEntity emp);
	EmployeeVO getEmpByNo(int eno);
	String editEmpData(EmployeeVO emp);
	String removeEmployeeById(int no);
	
	public  Page<EmployeeVO>  showEmployeesByPagination(Pageable pageable);
}
