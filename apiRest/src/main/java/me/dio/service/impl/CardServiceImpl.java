package me.dio.service.impl;

import me.dio.domain.model.Card;
import me.dio.domain.repository.CardRepository;
import me.dio.service.CardService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;

    public CardServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public Card findById(Long id) {
        return cardRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Card create(Card cardToCreate) {
        return cardRepository.save(cardToCreate);
    }
}
