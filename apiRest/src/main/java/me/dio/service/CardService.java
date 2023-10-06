package me.dio.service;
import me.dio.domain.model.Card;
import me.dio.domain.model.News;

public interface CardService {

    Card findById(Long id);

    Card create(Card CardToCreate);
}
