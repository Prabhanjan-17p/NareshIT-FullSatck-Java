package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.service.ProductBuy;

@SpringBootApplication
public class SpringBootMailProj01Application {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext run = SpringApplication.run(SpringBootMailProj01Application.class, args);){
			ProductBuy bean = run.getBean(ProductBuy.class);
			try {
				String msg = bean.allProduct(new String[] {"Pant","Shirt","Watch"},
						new double[] {1200.0,3550,8000}, 
						new String[] {"pravanjanamanta@gmail.com","pravanjan2003p@gmail.com"});
				
				System.out.println(msg);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
