package com.paulorocha.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulorocha.course.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
