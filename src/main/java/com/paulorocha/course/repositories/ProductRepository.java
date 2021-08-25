package com.paulorocha.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulorocha.course.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
