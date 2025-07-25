//ClassDemo.java
package com.nt.main;

import java.time.LocalDate;
import java.util.Arrays;

class  Demo{
	private int a;
	private  int b;
	
	public void m1() {
		
	}
	public void m2() {
		
	}
}

public class ClassDemo {
	
	public static void main(String[] args) {
		  Class c1=Demo.class;
		  System.out.println("c1 obj is holding ::"+c1.getName());
		  System.out.println("c1 obj's class super class name ::"+c1.getSuperclass());
		  System.out.println("c1 obj's class methods ::"+Arrays.toString(c1.getDeclaredMethods()));
		  System.out.println("c1 obj's class fields ::"+Arrays.toString(c1.getDeclaredFields()));
		  System.out.println("c1 obj's class constructors ::"+Arrays.toString(c1.getDeclaredConstructors()));
		  System.out.println("===========================");
		  Class c2=LocalDate.class;
		  System.out.println("c2 obj is holding ::"+c2.getName());
		  System.out.println("c2 obj's class super class name ::"+c2.getSuperclass());
		  System.out.println("c2 obj's class methods ::"+Arrays.toString(c2.getDeclaredMethods()));
		  System.out.println("c2 obj's class fields ::"+Arrays.toString(c2.getDeclaredFields()));
		  System.out.println("c2 obj's class constructors ::"+Arrays.toString(c2.getDeclaredConstructors()));
		  System.out.println("===========================");
	}

}
