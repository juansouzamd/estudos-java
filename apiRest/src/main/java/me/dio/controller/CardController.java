package me.dio.controller;

import me.dio.domain.model.Card;
import me.dio.domain.model.Feature;
import me.dio.service.CardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/cards")
public class CardController {

    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Card> findById(@PathVariable Long id) {
        var card = cardService.findById(id);
        return ResponseEntity.ok(card);
    }

    @PostMapping
    public ResponseEntity<Card> create(@RequestBody Card cardToCreate) {
        var cardCreated = cardService.create(cardToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(cardToCreate.getId())
                .toUri();
        return ResponseEntity.created(location).body(cardToCreate);
    }
}
