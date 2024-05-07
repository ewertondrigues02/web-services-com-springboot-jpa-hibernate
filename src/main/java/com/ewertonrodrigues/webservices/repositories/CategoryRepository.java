package com.ewertonrodrigues.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ewertonrodrigues.webservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
