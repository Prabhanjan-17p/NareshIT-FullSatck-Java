package com.nt.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "JPA_ARTIST")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Artist {
	@SequenceGenerator(name = "gen1", sequenceName = "JSID_SEQ", allocationSize = 1, initialValue = 1000)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	@Id
	private Integer jsid;

	@Column(length = 30)
	@NonNull
	private String jsname;

	@Column(length = 30)
	@NonNull
	private String jsaddrs;
	@NonNull
	private LocalDate dob;
	@NonNull
	private LocalTime tob;
	@NonNull
	private LocalDateTime doj;
}
