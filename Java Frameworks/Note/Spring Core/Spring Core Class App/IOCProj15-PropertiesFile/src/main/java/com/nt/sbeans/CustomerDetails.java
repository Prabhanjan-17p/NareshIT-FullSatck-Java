package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("custDetails")
public class CustomerDetails {
	@Autowired
	private  Environment env;
	
	@Override
	public  String toString() {
		return  env.getProperty("os.name")+"...."+env.getProperty("cust.name");
	}

}
