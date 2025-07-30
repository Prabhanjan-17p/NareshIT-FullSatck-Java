//ECommerceStore.java (target class)
package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public final class  ECommerceStore {
	//HAS-A property
	private  ICourier  courier;
	
	public ECommerceStore() {
	  System.out.println("ECommerceStore:: 0-param constructor");
	}
	
	public void  setCourier(ICourier courier) {
		System.out.println("ECommerceStore.setCourier()");
	   this.courier=courier;	
	}
	
	//B.method
	public   String   shopping(String[] items,double[] prices) {
		System.out.println("ECommerceStore.shopping()");
		//calculate bill amount
		double billamt=0.0;
		for(double p:prices)
			   billamt=billamt+p;
			//generate the order id
		   int oid=new Random().nextInt(10000);
		//use courier for deliver
		   String msg=courier.deliver(oid);
		  //  return  success message
		   return  Arrays.toString(items)+" :: are purchsed having prices::"+Arrays.toString(prices)+" with bill Amt::"+billamt+"--->"+msg;
		
		
		
	}

}
