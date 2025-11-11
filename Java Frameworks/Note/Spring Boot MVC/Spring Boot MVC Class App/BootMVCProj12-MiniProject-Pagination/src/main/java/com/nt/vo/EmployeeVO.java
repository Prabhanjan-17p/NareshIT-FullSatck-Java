package com.nt.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class EmployeeVO {
	private Integer empno;
	@NonNull
	private String ename;
	@NonNull
	private String eaddrs="HYD";
	@NonNull
	private String desg;
	@NonNull
	private Double salary;
	private Double grossSal;
	private Double netSal;
}
