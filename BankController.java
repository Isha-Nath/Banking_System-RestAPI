package com.practiceRestAPI.BankAppAPI.Controller;

import com.practiceRestAPI.BankAppAPI.DTO.AccountDto;
import com.practiceRestAPI.BankAppAPI.Model.Account;
import com.practiceRestAPI.BankAppAPI.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/banking")
public class BankController {

    @Autowired
    AccountService service;

    @PostMapping
    public AccountDto addAccount(@RequestBody AccountDto accountDto){
         return service.createAccount(accountDto);
    }
    @GetMapping("/{id}")
    public AccountDto getByID(@PathVariable long id){
        return service.getAccountByID(id);
    }

    @GetMapping
    public List<AccountDto> getAllAccount(){
        return service.getAll();
    }
    @PutMapping("/{id}/deposit")
    public AccountDto deposit(@PathVariable Long id ,@RequestBody Map<String, Double> amount){
        return service.deposit(id,amount);
    }
    @PutMapping("/{id}/withdraw")
    public AccountDto withdraw(@PathVariable long id,@RequestBody Map<String,Double> amount){
        return service.withdraw(id,amount);
    }

}
