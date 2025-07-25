//Printer.java
package com.nt.ston;

public class Printer {
	  //static ref variable to hold single object ref
	private  static   Printer    INSTANCE;

	  //private constructor
	private  Printer() {
		System.out.println("Printer:: 0-param constructor");
	}
	
	//public static  factory method having singleton logic
	public  static   Printer     getInstance() {
		//write  singleton logic
		if(INSTANCE==null)
			INSTANCE=new Printer();
		
		return INSTANCE;
	}
	
	//b.method
	public  void  printData(String msg) {
		System.out.println("data is ::"+msg);
	}
	
	
}
