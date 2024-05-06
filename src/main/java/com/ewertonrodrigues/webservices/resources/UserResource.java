package com.ewertonrodrigues.webservices.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ewertonrodrigues.webservices.entities.User;

@RestController
@RequestMapping(value= "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(null, "Maria", "maria@gmail.com", "456789455", "123456");
		return ResponseEntity.ok().body(u);
		
	}
	
	
	
	
	
	
	
}
