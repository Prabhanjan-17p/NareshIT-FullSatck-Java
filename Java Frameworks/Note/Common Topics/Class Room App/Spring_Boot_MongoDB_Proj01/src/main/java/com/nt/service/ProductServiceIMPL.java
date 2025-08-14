//package com.nt.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.nt.entity.Product;
//import com.nt.repository.IProductRepo;
//
//@Service("proSer")
//public class ProductServiceIMPL implements IProductService {
//	@Autowired
//	private IProductRepo prodReo;
//
//	@Override
//	public String saveProduct(Product prod) {
//		Product save = prodReo.save(prod);
//		return "Id :: "+save.getId();
//	}
//
//}
