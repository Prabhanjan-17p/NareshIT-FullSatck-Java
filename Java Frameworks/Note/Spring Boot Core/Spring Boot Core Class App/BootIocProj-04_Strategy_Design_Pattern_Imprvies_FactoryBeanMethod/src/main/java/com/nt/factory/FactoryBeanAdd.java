package com.nt.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.sbean.CNGEngine;
import com.nt.sbean.IEngine;
import com.nt.sbean.PetrolEngine;


@Component("fb")
public class FactoryBeanAdd implements FactoryBean<IEngine>{
	
	@Value("${engg.id}")
	private String engine;

	@Override
	public IEngine getObject() throws Exception {
		switch (engine) {
		case "cng":
			return new CNGEngine();
		case "petrol":
			return new PetrolEngine();
		case "diesel":
			return new PetrolEngine();

		default:
			throw new IllegalArgumentException("invalid id");
		}
	}

	@Override
	public Class<?> getObjectType() {
		return IEngine.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
	
	

}
