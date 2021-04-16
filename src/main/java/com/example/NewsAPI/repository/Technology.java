package com.example.NewsAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Technology extends CrudRepository<com.example.NewsAPI.entity.Technology, Integer> {
}
