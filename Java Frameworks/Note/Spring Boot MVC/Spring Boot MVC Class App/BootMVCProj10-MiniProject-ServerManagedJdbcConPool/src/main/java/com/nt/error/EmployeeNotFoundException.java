package com.nt.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.GATEWAY_TIMEOUT)
public class EmployeeNotFoundException extends RuntimeException {
	
	public EmployeeNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeNotFoundException(String msg) {
		super(msg);
	}
	

}
