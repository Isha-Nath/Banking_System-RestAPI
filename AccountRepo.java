package com.practiceRestAPI.BankAppAPI.Repository;

import com.practiceRestAPI.BankAppAPI.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {

}
