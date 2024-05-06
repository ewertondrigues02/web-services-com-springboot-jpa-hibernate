package com.ewertonrodrigues.webservices.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.ewertonrodrigues.webservices.entities.User;
import com.ewertonrodrigues.webservices.repositories.UserRepository;

@Configuration
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Linux Tovald", "linux@gmail.com", "21365478", "123456");
		User u2 = new User(null, "Bill Gates", "william@gmail.com", "41253698", "111009");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
}
