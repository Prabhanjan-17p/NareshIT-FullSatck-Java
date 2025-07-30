
//AppConfig.java
package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {
	
	@Bean(name="messageSource")  //bean id  is fixed
	public  ResourceBundleMessageSource  createRBMS() {
		ResourceBundleMessageSource  rbms=
				  new  ResourceBundleMessageSource();
		// confugre  base proerties file
		rbms.setBasename("com/nt/commons/App");
		return rbms;
	}

}
