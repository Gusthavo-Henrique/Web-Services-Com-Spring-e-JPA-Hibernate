package com.gusthavohenrique.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gusthavohenrique.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
