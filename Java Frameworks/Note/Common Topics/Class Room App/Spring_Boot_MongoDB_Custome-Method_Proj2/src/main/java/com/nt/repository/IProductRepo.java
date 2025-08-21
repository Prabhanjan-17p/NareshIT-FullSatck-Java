package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.entity.Product;

public interface IProductRepo extends MongoRepository<Product, String> {

}
