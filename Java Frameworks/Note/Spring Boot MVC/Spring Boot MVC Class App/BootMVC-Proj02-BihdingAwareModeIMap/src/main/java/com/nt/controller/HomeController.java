package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.model.Student;
import com.nt.service.ISeasonFinderService;

@Controller
public class HomeController {

    @Autowired
    private ISeasonFinderService service;

    // Home page
    @GetMapping("/")
    public String showHome() {
        return "wellcome";
    }

    // Season page
    @GetMapping("/season")
    public String showSeason(Map<String, Object> map) {
        map.put("resMsg", service.findSeason());
        return "display";
    }

    // Single handler for report: display everything
    @GetMapping("/report")
    public String showReport(Map<String, Object> map) {

        // Simple values
        map.put("name", "Raja");
        map.put("age", 30);

        // Collections and arrays
        List<String> friends = List.of("Raja", "Rani", "John", "Priya");
        String[] courses = {"Java", "Spring", "React"};
        map.put("friendsList", friends);
        map.put("coursesArray", courses);

        // Single Student object
        Student student = new Student(101, "Raja", "Spring Boot");
        map.put("stud", student);

        // List of Student objects
        List<Student> students = List.of(
            new Student(101, "Raja", "Java"),
            new Student(102, "Rani", "Python"),
            new Student(103, "John", "Spring Boot")
        );
        map.put("studentsList", students);

        return "report";
    }
    
    
    @GetMapping("/report2")
    public String showReportJstl(Map<String, Object> map) {

        // Simple values
        map.put("name", "Raja");
        map.put("age", 30);

        // Collections and arrays
        List<String> friends = List.of("Raja", "Rani", "John", "Priya");
        String[] courses = {"Java", "Spring", "React"};
        map.put("friendsList", friends);
        map.put("coursesArray", courses);

        // Single Student object
        Student student = new Student(101, "Raja", "Spring Boot");
        map.put("stud", student);

        // List of Student objects
        List<Student> students = List.of(
            new Student(101, "Raja", "Java"),
            new Student(102, "Rani", "Python"),
            new Student(103, "John", "Spring Boot")
        );
        map.put("studentsList", students);

        return "report2";
    }
}
