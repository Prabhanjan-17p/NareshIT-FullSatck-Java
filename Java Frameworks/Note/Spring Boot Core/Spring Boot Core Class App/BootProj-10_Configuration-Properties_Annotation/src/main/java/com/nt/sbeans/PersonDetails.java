package com.nt.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("pDetails")
@ConfigurationProperties(prefix = "org.nit")
public class PersonDetails {
	private String owner;
	private Integer no;
	private List<String> pFriends;
	private Map<String, Object> idDetails;
	private Set<Long> phNumber;
	private String[] favColors;
	private Student std;
}
