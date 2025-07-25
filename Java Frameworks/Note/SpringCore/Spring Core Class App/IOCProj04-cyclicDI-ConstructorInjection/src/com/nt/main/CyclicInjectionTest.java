package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.A;
import com.nt.sbeans.B;

public class CyclicInjectionTest {

	public static void main(String[] args) {
		//create the IOC container
		/*try(FileSystemXmlApplicationContext  ctx= 
				 new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");){*/
	/*	try(FileSystemXmlApplicationContext ctx=
				       new FileSystemXmlApplicationContext("E:\\Worskpaces\\Spring\\NTSPBMS718\\IOCProj04-cyclicDI-ConstructorInjection\\src\\com\\nt\\cfgs\\applicationContext.xml")){
	*/		
		/*try(ClassPathXmlApplicationContext ctx=
				      new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");){
		*/
		try(ClassPathXmlApplicationContext ctx=
				      new ClassPathXmlApplicationContext("applicationContext.xml");){
			
		//get Spring bean class obj  ref
			Class<A> clazz=A.class;
		  A  a=ctx.getBean("a1",clazz);
		  System.out.println("a=="+a);
		  
		  B  b=ctx.getBean("b1",B.class);
		  System.out.println("b==="+b);
		
		/*	B  b=(B)ctx.getBean("b1");
			System.out.println("b="+b);
		*/	}//try  ---> Since IOC container is AutoCloseable obj and created indide try with resource, 
		           //So it will be closed here automatically
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
