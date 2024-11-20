package com.neoteric.dockerlearning.polymorphism.abstractdemo;

import java.util.UUID;

public class RetailAccountServiceImpl  implements RetailAccountService {

    @Override
    public Account createAccount(String adhaar, String pan) {
        Account account = new Account();
        account.setAccount(UUID.randomUUID().toString());
        account.setBalance(100000.0);
        account.setAdhaar(adhaar);
        account.setPan(pan);
        SBIAccountDBService.accountMap.put(account.getAccount(),account);
        return account;


    }
}
