package com.nt.service;

import java.util.List;

import com.nt.entity.Product;
import com.nt.entity.Product2;

public interface IProductService {
	//For one product
//	public String saveProduct(Product prod);
	public List<Product> findAll();
	public String updateProduct(String id,double price);
	public List<Product> findInSortBy(Product prod, boolean asc, String ...catagories);
	
	//For Multiple Product
//	public List<Product> saveProduct(List<Product> prod);
	
//	public String saveProduct(Product1 prod);
	
	public String saveProduct(Product2 prod);
	
	public String deleteProduct(String id);
}
