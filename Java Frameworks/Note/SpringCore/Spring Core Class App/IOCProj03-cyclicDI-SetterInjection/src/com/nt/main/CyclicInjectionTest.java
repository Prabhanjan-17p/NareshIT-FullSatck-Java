//CyclicInjectionTest.java
package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.A;
import com.nt.sbeans.B;

public class CyclicInjectionTest {

	public static void main(String[] args) {
		//create the IOC container
		FileSystemXmlApplicationContext  ctx= 
				 new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Spring bean class obj  ref
		A  a=(A)ctx.getBean("a1");
		System.out.println("a="+a);
		System.out.println("======");
		B  b=(B)ctx.getBean("b1");
		System.out.println("b="+b);
		

	}

}
