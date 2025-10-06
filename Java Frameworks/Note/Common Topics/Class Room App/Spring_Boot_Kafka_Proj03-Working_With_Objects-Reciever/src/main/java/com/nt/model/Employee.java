package com.nt.model;

import java.io.Serializable;
import java.util.function.LongFunction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer eid;

	private String ename;

	private Float esal;

}
