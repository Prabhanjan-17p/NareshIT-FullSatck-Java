//DTDC.java (Dependent class1)
package com.nt.comps;

public final class DTDC implements ICourier {
	
	public DTDC() {
		System.out.println("DTDC:: 0-param constructor");
	}
	
	public   String  deliver(int oid) {
		System.out.println("DTDC.deliver()");
		return  oid+" order  id  items  set for delivery using  DTDC Courier Service";
	}

}
