package me.dio.service;
import me.dio.domain.model.Account;
import me.dio.domain.model.Card;

public interface AccountService {

    Account findById(Long id);

    Account create(Account accountToCreate);
}
