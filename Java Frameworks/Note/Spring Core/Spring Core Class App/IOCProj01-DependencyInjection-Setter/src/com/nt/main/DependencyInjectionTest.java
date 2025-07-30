//DependencyInjectionTest.java (main class)
package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		//create  IOC container
		FileSystemXmlApplicationContext  ctx=
				new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get target spring bean class obj ref
		Object obj1=ctx.getBean("wmg");
		
		//typecasting 
		WishMessageGenerator generator=(WishMessageGenerator)obj1;
		//invoke the b.method
		String result=generator.showWishMessage("raja");
		System.out.println(result);
		//close the IOC container
		ctx.close();

	}

}
