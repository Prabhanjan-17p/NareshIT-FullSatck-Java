package com.nt.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
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
@Table(name = "MVC_EmployeeEntity")
@SQLDelete(sql = "UPDATE BOOT_EMP SET STATUS = 'deleted' WHERE EMPNO = ?")
@Where(clause = "STATUS <> 'deleted'")
public class EmployeeEntity {
	@Id
	@SequenceGenerator(name = "gen1", allocationSize = 1, initialValue = 100, sequenceName = "STDSeq")
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer empno;

	@NonNull
	@Column(length = 30)
	private String ename;

	@NonNull
	@Column(length = 30)
	private String eaddrs;
	
	@NonNull
	@Column(name = "edesg")
	private String desg;

	@NonNull
	@Column(name = "salary")
	private Double salary;
	
	
	// MetaData Properties
	@Version
	private Integer updateCount;

	@CreationTimestamp
	@Column(insertable = true, updatable = false)
	private LocalDateTime creationTime;

	@UpdateTimestamp
	@Column(insertable = false, updatable = true)
	private LocalDateTime updationTime;

	@Column(length = 30)
	private String createdBy;

	@Column(length = 30)
	private String updatedBy;

	@Column(length = 30)
	private String active_SW = "active";
}
