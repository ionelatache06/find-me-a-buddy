package com.fmi.findmeabuddy.handler;

import com.fmi.findmeabuddy.domain.Account;
import com.fmi.findmeabuddy.repository.AccountRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserListHandler {
    
    private final AccountRepository accountRepository;
    
    public UserListHandler(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    
    @GetMapping(value = "/user",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Account> list() {
        return accountRepository.findAll();
    }
}
