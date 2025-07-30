//ECommerceStore.java (target class)
package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ecs")
@Scope("singleton")
public final class  ECommerceStore {
	//HAS-A property
	@Autowired
	@Qualifier("dtdc")
	private  ICourier  courier;
	
	public ECommerceStore() {
	  System.out.println("ECommerceStore:: 0-param constructor");
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
