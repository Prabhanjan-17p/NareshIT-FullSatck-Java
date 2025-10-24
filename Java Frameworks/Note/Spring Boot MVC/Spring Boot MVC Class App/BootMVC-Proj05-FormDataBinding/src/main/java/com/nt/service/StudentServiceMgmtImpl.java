package com.nt.service;

import com.nt.model.Student;

public class StudentServiceMgmtImpl implements IStudentMgmtService {

	@Override
	public String isPassFail(Student std) {
		Float avg = std.getAvg();
		if (avg < 30) {
			return "Fail";
		} else if (avg < 50) {
			return "Pass - Second Class";
		}else {
			return "Pass - First Class";
		}
	}

}
