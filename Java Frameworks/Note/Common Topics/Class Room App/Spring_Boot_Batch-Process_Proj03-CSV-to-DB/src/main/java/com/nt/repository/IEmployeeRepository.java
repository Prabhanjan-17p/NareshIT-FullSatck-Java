package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Employees;


public interface IEmployeeRepository extends CrudRepository<Employees, Integer> {

}
