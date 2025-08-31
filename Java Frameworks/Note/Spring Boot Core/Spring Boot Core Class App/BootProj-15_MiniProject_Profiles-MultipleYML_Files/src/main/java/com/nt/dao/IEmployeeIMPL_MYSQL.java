package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;



@Repository("mysql")
@Profile({"dev","test"})
public class IEmployeeIMPL_MYSQL implements IEmployeeDAO {
	@Autowired
	private DataSource ds;
	
	public IEmployeeIMPL_MYSQL() {
		System.out.println("IEmployeeIMPL_MYSQL 0-param ::");
	}

	private final String GET_EMPS_BY_DESGN = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";

	private final String INST_EMPS = "INSERT INTO EMP (ENAME, JOB, SAL) VALUES (?, ?, ?)";

	@Override
	public List<Employee> getEmpDetails(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> list;
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(GET_EMPS_BY_DESGN)) {
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			try (ResultSet res = ps.executeQuery()) {
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

	@Override
	public int insertEmpDetails(String name, String job, double sal) throws Exception {
	    int count = 0;
	    try (Connection con = ds.getConnection();
	         PreparedStatement ps = con.prepareStatement(INST_EMPS)) {
	        ps.setString(1, name);
	        ps.setString(2, job);
	        ps.setDouble(3, sal);
	        count = ps.executeUpdate();
	    } catch (Exception e) {
	        throw e;
	    }
	    return count;
	}


}
