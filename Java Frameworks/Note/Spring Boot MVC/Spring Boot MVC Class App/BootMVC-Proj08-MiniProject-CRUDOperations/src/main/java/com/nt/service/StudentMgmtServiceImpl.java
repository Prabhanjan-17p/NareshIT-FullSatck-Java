package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.EmployeeEntity;
import com.nt.repository.IStudentRepository;
import com.nt.vo.EmployeeVO;

@Service
public class StudentMgmtServiceImpl implements IStudentMgmtService {
	@Autowired
	private IStudentRepository repo;
	
	@Override
	public List<EmployeeVO> showAllData() {
		List<EmployeeEntity> list = repo.findAll();
		List<EmployeeVO> empVo = new ArrayList<EmployeeVO>();
		list.forEach(entiry -> {
			EmployeeVO emp = new EmployeeVO();
			BeanUtils.copyProperties(entiry, emp);
			emp.setGrossSal(emp.getSalary() + emp.getSalary()*0.5);
			emp.setNetSal(emp.getGrossSal() - emp.getGrossSal()*0.2);
			empVo.add(emp);
		});
		return empVo;
	}

}
