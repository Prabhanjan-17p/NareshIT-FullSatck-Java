package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BATCH_EMPLOYEES")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employees {
	@Id
	private Integer eno;
	@Column(length = 30)
	private String ename;
	@Column(length = 30)
	private String eadd;
	private String email;
	private Double salary;
	private Double grossSaIary;
	private Double netSaIary;
}
