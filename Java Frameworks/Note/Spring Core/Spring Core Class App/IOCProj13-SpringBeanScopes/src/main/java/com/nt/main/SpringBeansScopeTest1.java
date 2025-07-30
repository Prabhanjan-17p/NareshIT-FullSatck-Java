//SpringBeansScopeTest.java
package com.nt.main;

import java.lang.reflect.Constructor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.ston.Printer;

public class SpringBeansScopeTest1 {

	public static void main(String[] args) {
		   //create IOC container
		try(AnnotationConfigApplicationContext  ctx=new AnnotationConfigApplicationContext(AppConfig.class);){
			          Printer prn1=ctx.getBean("p1",Printer.class);
			          Printer prn2=ctx.getBean("p2",Printer.class);
			          System.out.println(prn1.hashCode()+"   "+prn2.hashCode());
			          System.out.println("=================");
			          
						/*             //Load the class
						       	  Class clazz=Class.forName("com.nt.ston.Printer");
						       	  //get the constructors of the loaded classes
						       	  Constructor  cons[]=clazz.getDeclaredConstructors();
						       	  //give access to  all the constuctors (private)
						       	  cons[0].setAccessible(true);
						       	  Object obj1=cons[0].newInstance();
						       	  Object obj2=cons[0].newInstance();
						       	  System.out.println(obj1.hashCode()+" ...."+obj2.hashCode());
						       	  System.out.println(obj1.getClass()+"....."+obj2.getClass());
						*/  }
		catch(Exception e) {
			e.printStackTrace();
		}
			          
	}//main
}//class
