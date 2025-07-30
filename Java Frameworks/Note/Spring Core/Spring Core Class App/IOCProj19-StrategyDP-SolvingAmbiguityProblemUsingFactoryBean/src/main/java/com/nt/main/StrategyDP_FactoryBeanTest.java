//StrategyDPTest.java
package com.nt.main;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.ECommerceStore;
import com.nt.sbeans.ICourier;

public class StrategyDP_FactoryBeanTest {

	public static void main(String[] args) {
		   //create IOC container
		try(AnnotationConfigApplicationContext  ctx=new AnnotationConfigApplicationContext(AppConfig.class);){
				//get target spring bean class obj ref
			ECommerceStore  store=ctx.getBean("ecs",ECommerceStore.class);
			//invoke the  b.method
			String  result=store.shopping(new String[] {"idol","laddu","decoration"}, 
					                                                       new double[] { 6000.0,5550.0,100000.0} );
			  System.out.println(result);
			  System.out.println("============================");
			    System.out.println("Bean ids  are :::"+Arrays.toString(ctx.getBeanDefinitionNames()));
			    Object obj=ctx.getBean("courier");
			    System.out.println("class name is ::"+obj.getClass());
				}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//main
}//class
