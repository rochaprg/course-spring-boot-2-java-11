package com.paulorocha.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulorocha.course.entity.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
	
	@GetMapping
	public ResponseEntity<User> findAll (){
		
		User u = new User(1L, "Paulo Rocha", "rochaprg@gmail.com", 984666717, "12@Dredd");
		
		return ResponseEntity.ok().body(u);
		
	}
	
	

}
