package com.nt.service;

public class StringHandler {
	 // b.method
	public  boolean isPallendrome(String word) {
		  return  word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
		  
	}

}
