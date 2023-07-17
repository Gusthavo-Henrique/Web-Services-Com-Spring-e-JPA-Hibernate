package com.gusthavohenrique.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gusthavohenrique.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
