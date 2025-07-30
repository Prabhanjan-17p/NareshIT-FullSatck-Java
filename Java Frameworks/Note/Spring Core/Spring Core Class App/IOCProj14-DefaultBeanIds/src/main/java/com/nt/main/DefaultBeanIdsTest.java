//StrategyDPTest.java
package com.nt.main;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.EcommerceStore;
import com.nt.ston.Printer;

public class DefaultBeanIdsTest {

	public static void main(String[] args) {
		   //create IOC container
		try(AnnotationConfigApplicationContext  ctx=new AnnotationConfigApplicationContext(AppConfig.class);){
			
			    System.out.println("Spring beans count::"+ctx.getBeanDefinitionCount());
			    System.out.println("Spring bean ids ::"+Arrays.toString(ctx.getBeanDefinitionNames()));
			    
			    
			    EcommerceStore store1=ctx.getBean("ecommerceStore",EcommerceStore.class);
			    System.out.println("class name:"+store1.getClass());
			    System.out.println("------------------------------");
			    
			    Printer p1=ctx.getBean("com.nt.ston.Printer#0",Printer.class);
			    System.out.println("class name:"+p1.getClass()+" "+p1.hashCode());
			    
			    System.out.println("------------------------------");
			    Printer p2=ctx.getBean("com.nt.ston.Printer",Printer.class);
			    System.out.println("class name:"+p2.getClass()+"  "+p2.hashCode());
			    
			    System.out.println("------------------------------");
			    Printer p3=ctx.getBean("getPrinter1",Printer.class);
			    System.out.println("class name:"+p3.getClass()+"  "+p3.hashCode());
					    
			
			
			
				}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}//main
}//class
