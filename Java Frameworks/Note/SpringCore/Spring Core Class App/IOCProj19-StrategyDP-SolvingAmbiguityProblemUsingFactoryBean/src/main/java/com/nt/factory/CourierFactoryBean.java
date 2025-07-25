package com.nt.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.sbeans.DHL;
import com.nt.sbeans.DTDC;
import com.nt.sbeans.ICourier;
@Component("courier")
public class CourierFactoryBean implements FactoryBean<ICourier> {
	@Value("${shipping.id}")
	private   String   id;

	@Override
	public ICourier getObject() throws Exception {
		System.out.println("CourierFactoryBean.getObject()");
		switch(id) {
		   case "dtdc": 
			    return  new  DTDC();
		   case "dhl":
			     return new DHL();
			  default:
				    throw new IllegalArgumentException("Invalid Id");
		}
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("CourierFactoryBean.getObjectType()");
		return ICourier.class;
	}
	
	@Override
	public boolean isSingleton() {
		System.out.println("CourierFactoryBean.isSingleton()");
		 return true;
		}

}
