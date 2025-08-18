package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.PersonDetails;
import com.nt.sbeans.Student;

@SpringBootApplication
public class BootProj10ConfigurationPropertiesAnnotationApplication {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx = SpringApplication
				.run(BootProj10ConfigurationPropertiesAnnotationApplication.class, args);) {
//			Student bean = ctx.getBean(Student.class);
//			System.out.println(bean);
			
			PersonDetails bean = ctx.getBean(PersonDetails.class);
			System.out.println(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
