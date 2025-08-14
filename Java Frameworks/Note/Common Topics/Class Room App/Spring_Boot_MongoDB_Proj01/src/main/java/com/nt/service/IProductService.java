package com.nt.service;

import java.util.List;

import com.nt.entity.Product;

public interface IProductService {
	//For one product
//	public String saveProduct(Product prod);
	
	//For Multiple Product
	public List<Product> saveProduct(List<Product> prod);
}
