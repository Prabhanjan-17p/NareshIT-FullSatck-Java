package com.nt.writter;

import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

@Component
public class BookItemWriter implements ItemWriter<String> {

	@Override
	public void write(Chunk<? extends String> items) throws Exception {
		System.out.println("BookItemWriter.write()");
		System.out.println("Process items are :: "+items);		
	}

}
