package com.nt.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString.Exclude;


@Entity
@Table(name = "OTM_EMP")
@RequiredArgsConstructor
@Getter
@Setter
public class Employee {
	@Id
	@SequenceGenerator(name = "gen1", initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer eid;
	
	@NonNull
	@Column(length = 30)
	private String name;
	
	@NonNull
	private Float sal; 
	
	@NonNull
	@Column(length = 30)
	private String Desgn;
	
	@Exclude
	@ManyToOne(targetEntity = Department.class,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "DEPT_ID", referencedColumnName = "DID")
	private Department dept;

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + ", Desgn=" + Desgn + "]";
	}

	public Employee() {
		super();
		System.out.println("Employee.Employee() :: 0 Parameter Constructors");
	}
	
	
	
}
