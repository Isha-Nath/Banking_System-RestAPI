package com.practiceRestAPI.BankAppAPI.Mapper;

import com.practiceRestAPI.BankAppAPI.DTO.AccountDto;
import com.practiceRestAPI.BankAppAPI.Model.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto dto){
        Account account = new Account(
                dto.getId(),
                dto.getName(),
                dto.getBalance()
        );
        return account;
    }

    public static AccountDto mapToAccountDto(Account account){
        AccountDto dto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return dto;
    }
}
