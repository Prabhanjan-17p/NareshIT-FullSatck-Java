package com.nt.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Document("Product Class 1")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Product1 {
	@Id
	private String id;
	@NonNull
	private String name;
	@NonNull
	private Double price;
	@NonNull
	private Double qnt;
	@NonNull
	private String desc;
	
}
