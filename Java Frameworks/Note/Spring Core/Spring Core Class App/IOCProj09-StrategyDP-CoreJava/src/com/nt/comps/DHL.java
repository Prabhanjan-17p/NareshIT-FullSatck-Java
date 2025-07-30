//DHL.java (Dependent class1)
package com.nt.comps;

public final class DHL implements ICourier {
	
	public DHL() {
		
		System.out.println("DHL:: 0-param constructor");
	}
	
	public   String  deliver(int oid) {
		System.out.println("DHL.deliver()");
		return  oid+" order  id  items  set for delivery using  DHL Courier Service";
	}

}
