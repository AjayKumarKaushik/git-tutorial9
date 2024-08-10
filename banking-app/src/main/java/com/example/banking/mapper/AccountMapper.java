package com.example.banking.mapper;

import com.example.banking.dto.AccountDto;
import com.example.banking.entity.Account;

public class AccountMapper {
    public static Account maptoAccount(AccountDto accountDto) {
        Account account = new Account(accountDto.getId(),
                accountDto.getAccountHoderName(),
                accountDto.getBalance());

        return account;
    }

    public static AccountDto mapToAccountDto(Account account) {
        AccountDto accountDto = new AccountDto(account.getId(),
                account.getAccountHolderName(),
                account.getBalance());
        return accountDto;
    }

}
