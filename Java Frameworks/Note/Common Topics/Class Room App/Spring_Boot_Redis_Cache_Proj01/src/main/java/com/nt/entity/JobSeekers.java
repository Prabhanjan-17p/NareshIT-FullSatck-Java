package com.nt.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "SPRING_REDIS_JOBSEEKERS")
public class JobSeekers implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "JS_ID")
	private Long id;
	@Column(length = 30, name = "JS_NAME")
	@NonNull
	private String name;
	@Column(length = 9, name = "JS_SAL_EXP")
	@NonNull
	private Double salary;
	@Column(length = 30, name = "JS_COURSE")
	@NonNull
	private String course;
	@Column(length = 4, name = "JS_PASS_YR")
	@NonNull
	private Integer year;
}
