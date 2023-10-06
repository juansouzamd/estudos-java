package me.dio.controller;

import me.dio.domain.model.Account;
import me.dio.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> findById(@PathVariable Long id) {
        var account = accountService.findById(id);
        return ResponseEntity.ok(account);
    }

    @PostMapping
    public ResponseEntity<Account> create(@RequestBody Account accountToCreate) {
        var cardCreated = accountService.create(accountToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(accountToCreate.getId())
                .toUri();
        return ResponseEntity.created(location).body(accountToCreate);
    }
}
