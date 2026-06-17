package com.practiceRestAPI.BankAppAPI.Service;

import com.practiceRestAPI.BankAppAPI.DTO.AccountDto;
import com.practiceRestAPI.BankAppAPI.Model.Account;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface AccountService{

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountByID(long id);

    List<AccountDto> getAll();

    AccountDto deposit(long id, Map<String,Double> amount);

    AccountDto withdraw(long id, Map<String,Double> amount);
}
