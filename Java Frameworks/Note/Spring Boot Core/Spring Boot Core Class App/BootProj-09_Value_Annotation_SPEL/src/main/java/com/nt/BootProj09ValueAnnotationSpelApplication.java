package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.spel.UsedSPEL;

@SpringBootApplication
public class BootProj09ValueAnnotationSpelApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(BootProj09ValueAnnotationSpelApplication.class, args);) {
			UsedSPEL bean = ctx.getBean(UsedSPEL.class);
			bean.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
