package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.entity.Product1;

public interface IProductRepo1 extends MongoRepository<Product1, String> {

}
