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
import jakarta.persistence.OneToMany;
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
@Table(name = "OTM_DEPT")
@RequiredArgsConstructor
@Getter
@Setter
public class Department {
	@Id
	@SequenceGenerator(name = "gen1", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer did;
	@NonNull
	@Column(length = 30)
	private String name;
	@NonNull
	@Column(length = 30)
	private String address;
	
	@Exclude
	@OneToMany(targetEntity = Employee.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "DEPT_ID", referencedColumnName = "DID")
	private Set<Employee> empDetails;
	
	

	@Override
	public String toString() {
		return "Department [did=" + did + ", name=" + name + ", address=" + address + "]";
	}



	public Department() {
		super();
		System.out.println("Department.Department() :: 0 Parameter Constructor");
	}
	
	
}
