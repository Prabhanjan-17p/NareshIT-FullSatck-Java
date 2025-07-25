//StrategyDPTest.java
package com.nt.main;

import com.nt.comps.ECommerceStore;
import com.nt.factory.ECommerceStoreFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		// invoke the method
		ECommerceStore  store=ECommerceStoreFactory.getInstance("dtdc");
		//invoke the b.method
		String result=store.shopping(new String[] {"rakhi","sweets","dress"},
				                                                            new double[] { 1000.0,2000.0, 4000.0});
		System.out.println(result);
		
		System.out.println("===============");
		// invoke the method
				ECommerceStore  store1=ECommerceStoreFactory.getInstance("dhl");
				//invoke the b.method
				String result1=store1.shopping(new String[] {"flag","sweets","white and white"},
						                                                            new double[] { 100.0,200.0, 400.0});
				System.out.println(result1);
				
		
		}

}
