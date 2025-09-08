package com.nt.runner;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootBatchTestRunner implements CommandLineRunner {

    @Autowired
    private JobLauncher launcher;
    @Autowired
    private Job job;

    @Override
    public void run(String... args) throws Exception {
        // Run the job
        JobExecution execution = launcher.run(
                job,
                new JobParametersBuilder()
                        .addDate("sysDate", new Date()) // ensures uniqueness
                        .toJobParameters()
        );

        System.out.println("Job Exit Status: " + execution.getExitStatus());
        
        System.out.println("Press any key to end the application!!");
        System.in.read();
        
        System.exit(0);
    }
}
