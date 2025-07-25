package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.config.AppConfig;
import com.nt.sbeans.CustomerDetails;
import com.nt.sbeans.CustomerInfo;

public class ValueAnnotationTest {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class)){
			//get Spring bean class obj ref
			CustomerInfo info=ctx.getBean("custInfo",CustomerInfo.class);
			System.out.println(info);
			System.out.println("======================");
			Environment   env=ctx.getEnvironment();
			System.out.println("env object class name::"+env.getClass());
			System.out.println("os.name  property value ::"+env.getProperty("os.name"));
			System.out.println("cust.name  property value ::"+env.getProperty("cust.name"));
			System.out.println("==================");
			CustomerDetails  details=ctx.getBean("custDetails",CustomerDetails.class);
			System.out.println(details);
			
		}
		catch(Exception  e) {
			e.printStackTrace();
		}

	}

}
