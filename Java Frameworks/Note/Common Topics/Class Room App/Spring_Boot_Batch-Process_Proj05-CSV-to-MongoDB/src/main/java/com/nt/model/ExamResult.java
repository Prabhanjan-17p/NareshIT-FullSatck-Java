package com.nt.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collation = "SuperTopBrain")
public class ExamResult {
    private Integer id;         
    private String dob;      
    private Double percentage;   
    private Integer semester;    
}
