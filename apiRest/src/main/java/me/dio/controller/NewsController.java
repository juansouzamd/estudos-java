package me.dio.controller;

import me.dio.domain.model.News;
import me.dio.domain.model.User;
import me.dio.service.NewsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/news")
public class NewsController {

    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<News> findById(@PathVariable Long id) {
        var news = newsService.findById(id);
        return ResponseEntity.ok(news);
    }

    @PostMapping
    public ResponseEntity<News> create(@RequestBody News newsToCreate) {
        var userCreated = newsService.create(newsToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newsToCreate.getId())
                .toUri();
        return ResponseEntity.created(location).body(newsToCreate);
    }
}
