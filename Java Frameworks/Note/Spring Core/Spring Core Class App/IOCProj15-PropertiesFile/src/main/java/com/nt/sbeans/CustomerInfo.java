//CustomerInfo.java
package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("custInfo")
public class CustomerInfo {
	//inject direct value
	@Value("99999954")
	private  Integer mobileno;
	//inject the values collected from the properties file
	@Value("${cust.id}")
	private  Integer cid;
	@Value("${cust.name}")
	private  String   cname;
	@Value("${cust.addrs}")
	private  String   caddrs;
	@Value("${cust.billamt}")
	private  String   bamt;
	@Value("${cust.mail}")
	private  String  email;
	
	//inject the values  collected  from the system  properties
	@Value("${user.name}")
	private String  username;
	@Value("${os.name}")
	private String  os_name;
	@Value("${os.version}")
	private String  os_version;
	
	//inject the env variable values
	@Value("${Path}")
	private  String pathData;

	
	
	
	
  	//toString  (alt+shift+s,s)
	@Override
	public String toString() {
		return "CustomerInfo [mobileno=" + mobileno + ", cid=" + cid + ", cname=" + cname + ", caddrs=" + caddrs
				+ ", bamt=" + bamt + ", email=" + email + ", username=" + username + ", os_name=" + os_name
				+ ", os_version=" + os_version + ", pathData=" + pathData + "]";
	}

	
	
	
	

}
