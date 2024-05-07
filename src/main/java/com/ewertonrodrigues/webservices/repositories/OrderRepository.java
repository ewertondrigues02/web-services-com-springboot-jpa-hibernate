package com.ewertonrodrigues.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ewertonrodrigues.webservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
