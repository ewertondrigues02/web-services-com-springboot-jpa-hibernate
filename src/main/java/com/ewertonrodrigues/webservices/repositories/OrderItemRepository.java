package com.ewertonrodrigues.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ewertonrodrigues.webservices.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
