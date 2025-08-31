package com.nt.sbean;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties(prefix = "nit.emp")
@Component("emp")
@Data
public class Employee {
	private int id;
	private String name;
	private String address;
	private double sal;

    private String[] favColor;
    private List<String> skills;
    private Set<Long> phoneNumbers;
    private Map<String, Object> idDetails;
    private Comapany com;
}
