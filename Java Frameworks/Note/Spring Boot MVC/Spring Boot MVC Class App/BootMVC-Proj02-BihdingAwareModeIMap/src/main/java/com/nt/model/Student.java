package com.nt.model;

public class Student {
    private Integer id;
    private String name;
    private String course;

    public Student(Integer id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public Integer getId() { return id; }
    public String getName() { return name; }
    public String getCourse() { return course; }
}
