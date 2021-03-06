package com.example.NewsAPI.rest;

import com.example.NewsAPI.entity.Category;
import com.example.NewsAPI.entity.Newsarticle;
import com.example.NewsAPI.entity.Region;
import com.example.NewsAPI.entity.Technology;
import com.example.NewsAPI.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path = "/api")
public class BreakingNewsController {
    @Autowired
    private NewsService newsService;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/breakingnews")
    public Object getBreakingNews() {
        return restTemplate.getForObject(
                "https://newsapi.org/v2/everything?apiKey=0b43be1f3dc84b2492d6691164b3edac&q=Business",
                Object.class);
    }

    @GetMapping("/latest")
    public Object getHeadlines() {
        return restTemplate.getForObject(
                "https://newsapi.org/v2/everything?apiKey=0b43be1f3dc84b2492d6691164b3edac&q=latest",
                Object.class);
    }

    @GetMapping("/search")
    public Object getNewsInshort(@RequestParam String categoryname) {
        return restTemplate.getForObject("https://inshortsapi.vercel.app/news?category=" + categoryname, Object.class);
    }

    @GetMapping("/category")
    public Iterable<Category> getAllCategory() {
        return newsService.getAllCategory();
    }

    @GetMapping("/allRegion")
    public Iterable<Region> getAllRegion() {
        return newsService.getAllRegion();
    }

    @GetMapping("/newarticle")
    public Iterable<Newsarticle> getAllTechnology() {
        return newsService.getAllTechnology();
    }
}
