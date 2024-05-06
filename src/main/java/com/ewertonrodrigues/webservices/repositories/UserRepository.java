package com.ewertonrodrigues.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ewertonrodrigues.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
