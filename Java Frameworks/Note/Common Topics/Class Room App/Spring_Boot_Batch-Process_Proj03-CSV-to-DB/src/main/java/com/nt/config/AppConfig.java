package com.nt.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.data.builder.RepositoryItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.transaction.PlatformTransactionManager;

import com.nt.entity.Employees;
import com.nt.listener.JobMonitoringListner;
import com.nt.processor.EmployeeProcessor;
import com.nt.repository.IEmployeeRepository;

@Configuration
public class AppConfig {
	@Autowired
	private JobMonitoringListner listner;
	@Autowired
	private EmployeeProcessor processor;
	@Autowired
	private IEmployeeRepository empRepo;
	
	
	
	//For Job Reader Object
	@Bean(name = "ffir")
	public FlatFileItemReader<Employees> createReader(){
		return new FlatFileItemReaderBuilder<Employees>()
				.name("ffir")
				.resource(new ClassPathResource("MOCK_DATA.csv"))
				.delimited()
				.names("eno","ename","eadd","email","salary")
				.targetType(Employees.class)
				.build();
	}
	
	
	// For Job Writer Object
	@Bean(name = "riw")
	public RepositoryItemWriter<Employees> createWriter(){
		return new RepositoryItemWriterBuilder<Employees>()
				.repository(empRepo)
				.methodName("save")
				.build();
	}
	
	
	@Bean(name ="step1")
	public Step createStep1(JobRepository repository, PlatformTransactionManager txMgmr) {
		System.out.println("AppConfig.createStep1()");
		return new StepBuilder("step1", repository)
				.<Employees, Employees> chunk(10,txMgmr)
				.reader(createReader())
				.processor(processor)
				.writer(createWriter())
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
