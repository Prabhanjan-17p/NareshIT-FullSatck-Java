//ECommerceStoreFactory.java  (Factory Pattern class)
package com.nt.factory;

import com.nt.comps.DHL;
import com.nt.comps.DTDC;
import com.nt.comps.ECommerceStore;
import com.nt.comps.ICourier;

public class ECommerceStoreFactory {
	
	//static factory method having  Factory Pattern logic
	public  static   ECommerceStore   getInstance(String courierType) {
		  //create one  of the Dependent class obj by choosing the courier type
		  ICourier courier=null;
		  if(courierType.equalsIgnoreCase("dtdc"))
			  courier=new DTDC();
		  else if(courierType.equalsIgnoreCase("dhl"))
			  courier=new DHL();
		  else
			  throw  new IllegalArgumentException("Invalid  courier type");
		  //create Target class object
		  ECommerceStore  store=new ECommerceStore();
		  //assign   Dependent class obj to target class object
		  store.setCourier(courier);
		  //return  Target class object
		  return store;
	}

}
