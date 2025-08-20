package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.entity.Product;
import com.nt.entity.Product2;
import com.nt.repository.IProductRepo;
import com.nt.repository.IProductRepo2;

@Service("proSer")
public class ProductServiceIMPL implements IProductService {
	@Autowired
	private IProductRepo prodReo;

	@Override
	public List<Product> findAll() {
		List<Product> list = prodReo.findAll();
		return list;
	}

	@Override
	public String updateProduct(String id, double price) {
		Product prod = prodReo.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid Id"));

		prod.setPrice(price);
		prodReo.save(prod);

		return "Product updated successfully!";
	}
	
	@Override
	public List<Product> findInSortBy(Product prod, boolean asc, String... catagories) {
		Sort.Direction dir = asc ? Sort.Direction.ASC : Sort.Direction.DESC;
		
		Sort sort = Sort.by(dir,catagories);
		
		return prodReo.findAll(sort);
	}

//	@Autowired
//	private IProductRepo1 prodReo;
//	@Override
//	public String saveProduct(Product1 prod) {
//		prod.setId(UUID.randomUUID().toString());
//		Product1 save = prodReo.save(prod);
//		return "Product is saved having id :: "+save.getId();
//	}

	@Autowired
	private IProductRepo2 prodRepo;

	@Override
	public String saveProduct(Product2 prod) {
		prod.setId(new Random().nextInt(10000));
		prodRepo.save(prod);
		return "Product saved with ID: " + prod.getId();
	}

	@Override
	public String deleteProduct(String id) {
		Optional<Product2> byId = prodRepo.findById(id);
		if (byId != null) {
			prodRepo.deleteById(id);
			return "Delete sucessfully";
		} else {
			return "ID Not found!!";
		}
	}

}
