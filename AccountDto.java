package com.practiceRestAPI.BankAppAPI.DTO;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
    private long id;
    private String name;
    private double balance;


}
