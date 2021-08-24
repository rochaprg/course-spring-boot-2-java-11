package com.paulorocha.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulorocha.course.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
