package com.quinnox.bankmanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quinnox.bankmanagementsystem.entities.News;

public interface NewsRepository extends JpaRepository<News, Integer>{

}
