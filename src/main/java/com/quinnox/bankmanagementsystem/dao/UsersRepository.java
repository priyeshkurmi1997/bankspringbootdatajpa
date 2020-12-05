package com.quinnox.bankmanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.quinnox.bankmanagementsystem.entities.User;

public interface UsersRepository extends JpaRepository<User, Integer> {
	


}
