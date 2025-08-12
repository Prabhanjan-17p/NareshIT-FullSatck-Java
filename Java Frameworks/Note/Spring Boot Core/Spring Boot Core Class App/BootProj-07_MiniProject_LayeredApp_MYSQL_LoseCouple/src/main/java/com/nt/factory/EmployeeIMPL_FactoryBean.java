package com.nt.factory;

import javax.sql.DataSource;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.dao.IEmployeeDAO;
import com.nt.dao.IEmployeeIMPL_MYSQL;
import com.nt.dao.IEmployeeIMPL_ORACLE;

@Component
public class EmployeeIMPL_FactoryBean implements FactoryBean<IEmployeeDAO> {
	@Value("${Emp.type}")
	private String type;
	
	@Autowired
	private DataSource ds;

	@Override
	public IEmployeeDAO getObject() throws Exception {
		if (type.equalsIgnoreCase("iImpMysql")) {
			return new IEmployeeIMPL_MYSQL(ds);
		}else if (type.equalsIgnoreCase("iImpOra")) {
			return new IEmployeeIMPL_ORACLE(ds);
		}else {
			throw new IllegalArgumentException("Invalid Id");
		}
	}

	@Override
	public Class<?> getObjectType() {
		return IEmployeeDAO.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
