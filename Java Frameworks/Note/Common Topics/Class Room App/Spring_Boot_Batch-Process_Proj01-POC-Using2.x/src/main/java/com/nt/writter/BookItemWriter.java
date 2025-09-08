package com.nt.writter;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

@Component
public class BookItemWriter implements ItemWriter<String> {

	@Override
	public void write(List<? extends String> items) throws Exception {
		System.out.println("BookItemWriter.write()");
		System.out.println("Process items are :: "+items);
	}

}
