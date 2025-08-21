package com.nt.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nt.entity.Product;

public interface IProductRepo extends MongoRepository<Product, String> {

    // Finder methods (JPA-style)
    List<Product> findByName(String name);
    List<Product> findByPrice(double price);
    List<Product> findByPriceBetween(double st, double end);

    // Custom Query - fetch only name & price by exact price
    @Query(value = "{ price: ?0 }", fields = "{ _id:0, name:1, price:1 }")
    List<Product> getPriceByData(double price);

    // Custom Query - Get all data by exact name
    @Query(value = "{ name: ?0 }")
    List<Product> getAllDataByName(String name);

    // Custom Query - Price between (Range)
    @Query(value = "{ price: { $gte: ?0, $lte: ?1 } }")
    List<Product> getProductDataByPriceRange(double st, double end);

    // Custom Query - Match BOTH name & quantity
    @Query(value = "{ $and: [ { name: ?0 }, { qnt: ?1 } ] }", 
           fields = "{ _id:0, name:1, price:1, qnt:1 }")
    List<Product> getByNameWithQnty(String name, double qnt);

    // Custom Query - Regex search (case-insensitive name search)
    @Query(value = "{ name: { $regex: ?0, $options: 'i' } }")
    List<Product> getProductsByNamePattern(String regex);
}
