package com.gusthavohenrique.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gusthavohenrique.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
