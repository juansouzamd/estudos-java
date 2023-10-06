package me.dio.service.impl;

import me.dio.domain.model.Account;
import me.dio.domain.repository.AccountRepository;
import me.dio.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account findById(Long id) {
        return accountRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Account create(Account cardToCreate) {
        return accountRepository.save(cardToCreate);
    }
}
