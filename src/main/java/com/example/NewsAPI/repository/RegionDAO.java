package com.example.NewsAPI.repository;

import com.example.NewsAPI.entity.Region;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionDAO extends CrudRepository<Region, Integer> {
}
