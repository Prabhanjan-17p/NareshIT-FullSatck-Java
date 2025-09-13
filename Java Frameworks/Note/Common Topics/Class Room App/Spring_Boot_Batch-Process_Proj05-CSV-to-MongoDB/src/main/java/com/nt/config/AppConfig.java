package com.nt.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.data.MongoItemWriter;
import org.springframework.batch.item.data.builder.MongoItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.transaction.PlatformTransactionManager;

import com.nt.listener.JobMonitoringListner;
import com.nt.model.ExamResult;
import com.nt.processor.ExamResultIteamProcessor;

@Configuration
public class AppConfig {
	@Autowired
	private JobMonitoringListner listner;
	@Autowired
	private DataSource ds;
	@Autowired
	private ExamResultIteamProcessor processor;
	@Autowired
	private MongoTemplate template;
	
	@Bean
	public FlatFileItemReader<ExamResult> createReader() {
	    return new FlatFileItemReaderBuilder<ExamResult>()
	            .name("writer")
	            .resource(new ClassPathResource("TopBrain.csv"))
	            .delimited().delimiter(",")
	            .names("id","dob","percentage","semester")
	            .targetType(ExamResult.class)
	            .build();
	}
	
	@Bean
	public MongoItemWriter<ExamResult> createWriter(){
		return new MongoItemWriterBuilder<ExamResult>()
				.collection("SuperTopBrain")
				.template(template)
				.build();
				
	}	

	
	//Creating a Step Object
	@Bean(name ="step1")
	public Step createStep1(JobRepository repository, PlatformTransactionManager txMgmr) {
		System.out.println("AppConfig.createStep1()");
		return new StepBuilder("step1", repository)
				.<ExamResult, ExamResult> chunk(10,txMgmr)
				.reader(createReader())
				.processor(processor)
				.writer(createWriter())
				.build();
	}
	
	
	//Creating a Job Object
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
