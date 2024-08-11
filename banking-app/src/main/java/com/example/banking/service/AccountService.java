package com.example.banking.service;

import com.example.banking.dto.AccountDto;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccountById(Long id);
    AccountDto deposit(Long id, double ammount);
    AccountDto withdraw(Long id,double ammount);
    List<AccountDto> getAllAccounts();
    void deleteAccount(Long id);
    AccountDto updateAccountHolderName(Long id,String newName);
}
