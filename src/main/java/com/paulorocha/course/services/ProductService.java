package com.paulorocha.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulorocha.course.entity.Category;
import com.paulorocha.course.entity.Product;
import com.paulorocha.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		
		return repository.findAll();
		
	}
	
	public Product findById (Long id) {
		
		Optional<Product> obj = repository.findById(id);
		
		return obj.get();
	}

}
