package com.nt.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String carId;
	private String brand;
	private String model;
	private int year;
	private double price;
}
