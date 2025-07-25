//SpringBeansScopeTest.java
package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.ECommerceStore;

public class SpringBeansScopeTest {

	public static void main(String[] args) {
		   //create IOC container
		try(AnnotationConfigApplicationContext  ctx=new AnnotationConfigApplicationContext(AppConfig.class);){
			/*            ECommerceStore  store1=ctx.getBean("ecs",ECommerceStore.class);
			            ECommerceStore  store2=ctx.getBean("ecs",ECommerceStore.class);
			            System.out.println(store1.hashCode()+"   "+store2.hashCode());
			            System.out.println("store1==store2?"+(store1==store2));
			*/				}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//main
}//class
