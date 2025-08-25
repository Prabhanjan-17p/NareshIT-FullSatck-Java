package com.nt.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                   // Generates getters, setters, toString, equals, and hashCode
@NoArgsConstructor      // Generates a no-args constructor
@AllArgsConstructor     // Generates a constructor with all fields
public class Student implements Serializable {

    private static final long serialVersionUID = 1L; // Recommended for Serializable

    private int id;
    private String name;
    private int age;
    private String email;
}
