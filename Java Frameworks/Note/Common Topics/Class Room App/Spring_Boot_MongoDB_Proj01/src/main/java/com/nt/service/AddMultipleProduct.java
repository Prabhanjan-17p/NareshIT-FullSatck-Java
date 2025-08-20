//package com.nt.service;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.nt.entity.Product;
//import com.nt.repository.IProductRepo;
//
//@Service("proSerAll")
//public class AddMultipleProduct implements IProductService{
//	@Autowired
//	private IProductRepo prodRepo;
//
//	@Override
//	public List<Product> saveProduct(List<Product> prod) {
//		List<Product> saveAll = prodRepo.saveAll(prod);
//		return saveAll;
//	}
//}
