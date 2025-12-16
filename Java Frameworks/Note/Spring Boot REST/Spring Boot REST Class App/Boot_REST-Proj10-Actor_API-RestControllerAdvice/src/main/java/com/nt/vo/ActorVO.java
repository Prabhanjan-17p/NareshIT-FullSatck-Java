package com.nt.vo;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class ActorVO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer aid;
    @NonNull
    private String aname;
    @NonNull
    private String addrs;
    @NonNull
    private Double remuneration;
    @NonNull
    private LocalDate dob;
}
