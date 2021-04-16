package com.example.NewsAPI.service;


import com.example.NewsAPI.entity.Category;
import com.example.NewsAPI.entity.Newsarticle;
import com.example.NewsAPI.entity.Region;
import com.example.NewsAPI.entity.Technology;
import com.example.NewsAPI.repository.CategoryDAO;
import com.example.NewsAPI.repository.NewsDAO;
import com.example.NewsAPI.repository.RegionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    NewsDAO newsDAO;
    @Autowired
    CategoryDAO categoryDAO;
    @Autowired
    RegionDAO regionDAO;
    @Autowired
    com.example.NewsAPI.repository.Technology technologyDAO;

    @Override
    public Iterable<Newsarticle> getNewsByRegion(String name) {
        return newsDAO.findAllByRegion(name);
    }

    @Override
    public Iterable<Category> getAllCategory() {
        return categoryDAO.findAll();
    }

    @Override
    public Iterable<Newsarticle> getAllTechnology() {
        return newsDAO.findAll();
    }

    @Override
    public Iterable<Region> getAllRegion() {
        return regionDAO.findAll();
    }
}
