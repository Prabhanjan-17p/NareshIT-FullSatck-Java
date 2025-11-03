package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.EmployeeEntity;
import com.nt.error.EmployeeNotFoundException;
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
			emp.setGrossSal(emp.getSalary() + emp.getSalary() * 0.5);
			emp.setNetSal(emp.getGrossSal() - emp.getGrossSal() * 0.2);
			empVo.add(emp);
		});
		return empVo;
	}

	@Override
	public String registerEmployee(EmployeeEntity emp) {
		repo.save(emp);

		return "Register Successfully Having ID:: " + emp.getEmpno();
	}

	@Override
	public EmployeeVO getEmpByNo(int eno) {
		EmployeeEntity empEntity = repo.findById(eno).orElseThrow(() -> new IllegalArgumentException("Invalid ID"));
		EmployeeVO emp = new EmployeeVO();
		BeanUtils.copyProperties(empEntity, emp);
		return emp;
	}

	@Override
	public String editEmpData(EmployeeVO emp) {
		EmployeeEntity empEntity = repo.findById(emp.getEmpno())
				.orElseThrow(() -> new IllegalArgumentException("Invalid ID"));
		BeanUtils.copyProperties(emp, empEntity);
		empEntity.setUpdatedBy(System.getProperty("user.name"));
		// update the object
		repo.save(empEntity);
		return emp.getEmpno() + " Employee Data is Updated";
	}

	@Override
	public String removeEmployeeById(int no) {
		// load the object
		EmployeeEntity empEntity = repo.findById(no).orElseThrow(() -> new EmployeeNotFoundException("Invalid Id"));
		// use repo
		repo.deleteById(no);

		return no + " Employee is Deleted";
	}

}
