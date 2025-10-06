package com.nt.entity;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class BankAccount {
	//Data properties
	@Id
	@SequenceGenerator(name="gen1",initialValue = 100000000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
    private Long  accno;
	@NonNull
	@Column(length = 30)
	private  String holderName;
	@NonNull
	@Column(length = 30)
	private  String addrs;
	@NonNull
	private  Double balance;
	
	// MetaData Properties
	@Version   //Versioning Feature
	private  Integer updationCount;
	@CreationTimestamp   //Timestamp feature
	@Column(insertable = true,updatable = false)
	private LocalDateTime creationTime;
	@UpdateTimestamp  // Timestamp  feature
	@Column(insertable = false,updatable = true)
	private  LocalDateTime lastAccessTime;
	@Column(length = 30)
	private  String createBy;
	@Column(length = 30)
	private  String updatedBy;
	@Column(length = 10)
	private  String active_SW="active";
}
