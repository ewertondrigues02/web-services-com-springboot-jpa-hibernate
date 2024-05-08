package com.ewertonrodrigues.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ewertonrodrigues.webservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
