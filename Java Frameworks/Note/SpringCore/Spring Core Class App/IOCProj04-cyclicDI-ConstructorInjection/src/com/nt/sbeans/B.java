//B.java
package com.nt.sbeans;

public class B {
	private   A  a;
	public B(A a) {
		this.a=a;
		System.out.println("A::1-param constructpor");
	}
	
	/*	public  void setA(A  a) {
			System.out.println("B.setA()");
			this.a=a;
		}
	*/	
	@Override
	public String toString() {
		return "From B";
	}

}
