package com.practiceRestAPI.BankAppAPI.Service.impl;

import com.practiceRestAPI.BankAppAPI.DTO.AccountDto;
import com.practiceRestAPI.BankAppAPI.Mapper.AccountMapper;
import com.practiceRestAPI.BankAppAPI.Model.Account;
import com.practiceRestAPI.BankAppAPI.Repository.AccountRepo;
import com.practiceRestAPI.BankAppAPI.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepo repo;

    @Override
    public AccountDto createAccount(AccountDto accountDto){
        Account account = AccountMapper.mapToAccount(accountDto);
        Account saved = repo.save(account);
        return AccountMapper.mapToAccountDto(saved);
    }
    @Override
    public AccountDto getAccountByID(long id){
        Account account = repo
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Not Found"));

        return AccountMapper.mapToAccountDto(account);
    }
    @Override
    public List<AccountDto> getAll(){
        List<Account> account = repo.findAll();
        List<AccountDto> dto = new ArrayList<>();
        for(Account acc : account){
            dto.add(AccountMapper.mapToAccountDto(acc));
        }
        return dto;
    }
    @Override
    public AccountDto deposit(long id , Map<String,Double> amount){
        Account account = repo
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Account doesn't exist"));

        double amnt = account.getBalance() + amount.get("balance");
        account.setBalance(amnt);
        Account savedAccnt = repo.save(account);
        return AccountMapper.mapToAccountDto(savedAccnt);
    }

    @Override
    public AccountDto withdraw(long id, Map<String, Double> amount){
        Account account = repo
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Account doesn't exist"));
        double amnt = account.getBalance() - amount.get("balance");
        account.setBalance(amnt);
        return AccountMapper.mapToAccountDto(repo.save(account));
    }

}
