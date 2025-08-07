package com.nt.main;

import com.nt.service.StringHandler;

public class DemoApp {
	
	public static void main(String[] args) {
		 StringHandler handler=new StringHandler();
		 System.out.println("Is Madam pallendrome?"+handler.isPallendrome("madam"));
		 System.out.println("Is malayalam pallendrome?"+handler.isPallendrome("malayalam"));
		 System.out.println("Is nareshit pallendrome?"+handler.isPallendrome("nareshit"));
		 
		 
		 
		
	}

}
