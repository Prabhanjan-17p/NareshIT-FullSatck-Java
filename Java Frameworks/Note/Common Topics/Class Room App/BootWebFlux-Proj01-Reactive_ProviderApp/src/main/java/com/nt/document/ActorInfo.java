package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class ActorInfo {
	@Id
	private Integer id;
	@NonNull
	private String aname;
	@NonNull
	private String category;
	@NonNull
	private Double fee;
}
