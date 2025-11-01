package com.nt.service;

import java.util.List;

import com.nt.entity.EmployeeEntity;
import com.nt.vo.EmployeeVO;

public interface IStudentMgmtService {
	List<EmployeeVO> showAllData();

	String registerEmployee(EmployeeEntity emp);
}
