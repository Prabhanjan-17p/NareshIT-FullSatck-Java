package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name = "JPA_JS_TAB")
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class JobSeeker {
	@Column(name = "JS_ID")
	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	// @GeneratedValue // default GEnerator is AUTO

	@SequenceGenerator(name = "gen1", sequenceName = "JSID_SEQUENCE1", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)

	// @GeneratedValue(strategy = GenerationType.SEQUENCE)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer jsid;
	@NonNull
	@Column(length = 30, name = "JS_NAME")
	private String jsname;
	@NonNull
	@Column(length = 30, name = "JS_ADDRS")
	private String jsaddrs;
	@NonNull
	@Column(length = 30, name = "JS_QLFY")
	@Transient
	private String qlfy;
	@NonNull
	@Column(name = "JS_EXP_SALARY")
	private Float expectedSalary;
	@NonNull
	@Column(name = "JS_EMAIL")
	private String email;

	@Column(name = "JS_LOCATION")
	private String location;

}
