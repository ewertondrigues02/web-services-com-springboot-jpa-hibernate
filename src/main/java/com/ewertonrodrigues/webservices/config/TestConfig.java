package com.ewertonrodrigues.webservices.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.ewertonrodrigues.webservices.entities.Category;
import com.ewertonrodrigues.webservices.entities.Order;
import com.ewertonrodrigues.webservices.entities.User;
import com.ewertonrodrigues.webservices.entities.enums.OrderStatus;
import com.ewertonrodrigues.webservices.repositories.CategoryRepository;
import com.ewertonrodrigues.webservices.repositories.OrderRepository;
import com.ewertonrodrigues.webservices.repositories.UserRepository;

@Configuration
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {

		userRepository.deleteAll();
		orderRepository.deleteAll();
		categoryRepository.deleteAll();
		
		Category cat1 = new Category(null, "Eletronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		User u1 = new User(null, "Linux Tovald", "linux@gmail.com", "21365478", "123456");
		User u2 = new User(null, "Bill Gates", "william@gmail.com", "41253698", "111009");

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.WAITING_PAYMENT, u1);

		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
	}
}
