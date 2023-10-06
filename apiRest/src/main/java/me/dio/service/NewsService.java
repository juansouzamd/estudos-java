package me.dio.service;
import me.dio.domain.model.News;

public interface NewsService {

    News findById(Long id);

    News create(News newsToCreate);
}
