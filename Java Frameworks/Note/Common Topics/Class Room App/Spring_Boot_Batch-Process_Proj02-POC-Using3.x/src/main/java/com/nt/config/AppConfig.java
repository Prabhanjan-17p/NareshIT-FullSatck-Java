package com.nt.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

import com.nt.listener.JobMonitoringListner;
import com.nt.processor.BookItemProcessor;
import com.nt.reader.BookItemReader;
import com.nt.writter.BookItemWriter;

@Configuration
public class AppConfig {
	@Autowired
	private JobMonitoringListner listner;
	@Autowired
	private BookItemReader itemReader;
	@Autowired
	private BookItemProcessor processor;
	@Autowired
	private BookItemWriter writer;
	
	
	@Bean(name ="step1")
	public Step createStep1(JobRepository repository, PlatformTransactionManager txMgmr) {
		System.out.println("AppConfig.createStep1()");
		return new StepBuilder("step1", repository)
				.<String,String> chunk(3,txMgmr)
				.reader(itemReader)
				.processor(processor)
				.writer(writer)
				.build();
	}
	
	@Bean(name ="job1")
	public Job createJob(JobRepository repository,Step step1) {
		System.out.println("AppConfig.createJob()");
		return new JobBuilder("job1",repository)
				.incrementer(new RunIdIncrementer())
				.listener(listner)
				.start(step1)
				.build();
	}
}
