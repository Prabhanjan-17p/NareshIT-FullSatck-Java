package com.nt.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;


@Component
public class BookItemProcessor implements ItemProcessor<String, String> {

	@Override
	public String process(String item) throws Exception {
		System.out.println("BookItemProcessor.process()");
		switch (item) {
		case "BBJ": // Black Book Java
			return item + " by -- Nageswara Rao";
		case "CRJ": // Core Java
			return item + " by -- Cay S. Horstmann";
		case "TIJ": // Thinking in Java
			return item + " by -- Bruce Eckel";
		case "EJ": // Effective Java
			return item + " by -- Joshua Bloch";
		case "HFJ": // Head First Java
			return item + " by -- Kathy Sierra & Bert Bates";
		default:
			throw new IllegalArgumentException("Unexpected value: " + item);
		}
	}

}
