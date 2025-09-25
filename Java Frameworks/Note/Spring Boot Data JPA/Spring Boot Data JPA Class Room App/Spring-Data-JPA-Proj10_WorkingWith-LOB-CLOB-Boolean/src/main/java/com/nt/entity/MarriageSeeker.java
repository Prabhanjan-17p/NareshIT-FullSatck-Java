package com.nt.entity;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name = "JPA_MarriageSeeker")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class MarriageSeeker implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "gen1", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen1")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NonNull
	@Column(name = "Name",length = 50)
	private String name;
	
	@NonNull
	@Column(name = "DOB")
	private LocalDate dob;
	
	@NonNull
	@Column(name = "is_Single")
	private Boolean isSingle;
	
	//for Oracle 
//	@NonNull
//	@Column(name = "Photo")
//	@Lob
//	private byte[] photoCandidate;
//	@NonNull
//	@Column(name = "Resume")
//	@Lob
//	private char[] resumeCandidate;
	
	//for MYSQL
	@Lob
	@Column(name = "Photo", columnDefinition = "LONGBLOB")
	@NonNull
	private byte[] photoCandidate;

	@Lob
	@Column(name = "Resume", columnDefinition = "LONGTEXT")
	@NonNull
	private char[] resumeCandidate;

	
}
