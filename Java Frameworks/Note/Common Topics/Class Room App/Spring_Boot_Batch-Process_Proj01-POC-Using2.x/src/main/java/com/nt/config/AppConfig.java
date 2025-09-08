package com.nt.config;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nt.listener.JobMonitoringListner;
import com.nt.processor.BookItemProcessor;
import com.nt.reader.BookItemReader;
import com.nt.writter.BookItemWriter;

@Configuration
@EnableBatchProcessing
public class AppConfig {
	@Autowired
	private JobBuilderFactory jobFactory;
	@Autowired
	private StepBuilderFactory stepFactory;
	@Autowired
	private JobMonitoringListner listner;
	@Autowired
	private BookItemReader itemReader;
	@Autowired
	private BookItemProcessor processor;
	@Autowired
	private BookItemWriter writer;
	
	
	@Bean(name ="step1")
	public Step createStep1() {
		System.out.println("AppConfig.createStep1()");
		return stepFactory.get("step1")
				.<String,String> chunk(3)
				.reader(itemReader)
				.processor(processor)
				.writer(writer)
				.build();
	}
	
	@Bean(name ="job1")
	public Job createJob() {
		System.out.println("AppConfig.createJob()");
		return jobFactory.get("job1")
				.incrementer(new RunIdIncrementer())
				.listener(listner)
				.start(createStep1())
				.build();
	}
}
