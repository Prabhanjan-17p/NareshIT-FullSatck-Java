package com.nt.sbean;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    // Runs every 5 seconds
    @Scheduled(fixedRate = 5000) // Used for periodic tasks like health checks, polling APIs
    public void taskEvery5Seconds() {
        System.out.println("Task 1: Runs every 5 seconds - " + System.currentTimeMillis());
    }

    // Runs with a fixed delay of 10 seconds after the last execution finishes
    @Scheduled(fixedDelay = 10000) // Used when you want a pause between each execution
    public void taskWithFixedDelay() {
        System.out.println("Task 2: Runs 10 seconds after last completion - " + System.currentTimeMillis());
    }

    // Runs every day at 10:30 AM
    @Scheduled(cron = "0 30 10 * * ?") // Used for daily jobs like sending reports or backups
    public void dailyTask() {
        System.out.println("Task 3: Runs daily at 10:30 AM - " + System.currentTimeMillis());
    }

    // Runs every Monday at 9:00 AM
    @Scheduled(cron = "0 0 9 ? * MON") // Used for weekly jobs like summary reports
    public void weeklyTask() {
        System.out.println("Task 4: Runs every Monday at 9:00 AM - " + System.currentTimeMillis());
    }
}
