package com.example.NewsAPI.service;


import com.example.NewsAPI.entity.Category;
import com.example.NewsAPI.entity.Newsarticle;
import com.example.NewsAPI.entity.Region;
import com.example.NewsAPI.entity.Technology;
import org.springframework.stereotype.Component;

@Component
public interface NewsService {

    Iterable<Newsarticle> getNewsByRegion(String name);

    Iterable<Category> getAllCategory();

    Iterable<Newsarticle> getAllTechnology();

    Iterable<Region> getAllRegion();
}
