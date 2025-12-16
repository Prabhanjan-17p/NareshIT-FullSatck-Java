package com.nt.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
@Table(name = "MP_ACTOR_ENTITY")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class ActorEntity implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
    @SequenceGenerator(
            name = "actor_seq_gen",
            sequenceName = "ACTOR_SEQ",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "actor_seq_gen"
    )
    private Integer aid;

    @NonNull
    @Column(length = 30, nullable = false)
    private String aname;

    @NonNull
    @Column(length = 30, nullable = false)
    private String addrs;

    @NonNull
    @Column(nullable = false)
    private Double remuneration;

    @NonNull
    @Column(nullable = false)
    private LocalDate dob;

    // ---------- Meta Data ----------
    
    @Version
    private Integer updateCount;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime registeredOn;

    @UpdateTimestamp
    @Column(insertable = false)
    private LocalDateTime updatedOn;

    @Column(length = 30)
    private String createdBy;

    @Column(length = 30)
    private String updatedBy;

    @Column(length = 10)
    private String active_SW = "ACTIVE";
}
