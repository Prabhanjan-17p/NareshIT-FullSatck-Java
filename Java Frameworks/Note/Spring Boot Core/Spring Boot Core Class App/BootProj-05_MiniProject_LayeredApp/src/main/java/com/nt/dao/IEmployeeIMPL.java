package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("iImp")
public class IEmployeeIMPL implements IEmployeeDAO {
	@Autowired
	private DataSource ds;
	
	private final String GET_EMPS_BY_DESGN = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";

	@Override
	public List<Employee> getEmpDetails(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> list;
		try (Connection con = ds.getConnection();PreparedStatement ps = con.prepareStatement(GET_EMPS_BY_DESGN)){
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			try (ResultSet res = ps.executeQuery()){
				list = new ArrayList<Employee>();
				while (res.next()) {
					Employee emp = new Employee();
					emp.setEid(res.getInt(1));
					emp.setEname(res.getString(2));
					emp.setDesg(res.getString(3));
					emp.setSalary(res.getDouble(4));
					
					list.add(emp);
				}
			} 
		} catch (Exception e) {
			throw e;
		}
		return list;
	}

}
