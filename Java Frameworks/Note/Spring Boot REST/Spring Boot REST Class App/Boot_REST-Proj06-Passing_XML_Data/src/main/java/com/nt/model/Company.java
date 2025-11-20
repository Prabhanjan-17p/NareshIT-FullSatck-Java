package com.nt.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
	private Integer cid;
	private String cname;
	private String caddrs;
	private String[] branches;
	private Set<Long> phone;
	private List<String> products;
	private Map<String, Object> details;
	private Customer cust;
	
}
