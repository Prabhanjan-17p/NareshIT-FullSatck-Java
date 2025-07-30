//AppConfig.java
package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan(basePackages = "com.nt.sbeans")
//@PropertySource({"com/nt/commons/Info.properties","com/nt/commons/Info1.properties"})
@PropertySources(value={@PropertySource("com/nt/commons/Info1.properties"),@PropertySource("com/nt/commons/info.properties")})
public class AppConfig {

}
