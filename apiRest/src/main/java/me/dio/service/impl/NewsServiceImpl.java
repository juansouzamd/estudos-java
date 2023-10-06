package me.dio.service.impl;

import me.dio.domain.model.News;
import me.dio.domain.repository.NewsRepository;
import me.dio.service.NewsService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class NewsServiceImpl implements NewsService {

    private final NewsRepository newsRepository;

    public NewsServiceImpl(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @Override
    public News findById(Long id) {
        return newsRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public News create(News newsToCreate) {
        return newsRepository.save(newsToCreate);
    }
}
