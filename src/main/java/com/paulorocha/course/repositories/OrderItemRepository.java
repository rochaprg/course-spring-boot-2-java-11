package com.paulorocha.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulorocha.course.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	

}
