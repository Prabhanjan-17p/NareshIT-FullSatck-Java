//B.java
package com.nt.sbeans;

public class B {
	private   A  a;
	public B() {
		System.out.println("B::0-param constructpor");
	}
	
	public  void setA(A  a) {
		System.out.println("B.setA()");
		this.a=a;
	}
	
	@Override
	public String toString() {
		return "From B";
	}

}
