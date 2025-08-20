package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nt.entity.Product2;

public interface IProductRepo2 extends MongoRepository<Product2, String> {

}
