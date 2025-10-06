package com.nt.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer eid;

	private String ename;

	private Float esal;

}
