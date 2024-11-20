package com.neoteric.CombOfAbstractInterfaceAndException;

import com.neoteric.dockerlearning.polymorphism.abstractdemo.SBIAccountDBService;

import java.util.UUID;

public class RetailAccountServiceImpl implements RetailAccountService {
    @Override
    public Account createAccount(String adhaaar, String pan) {

        Account account = new Account();
        account.setAccount(UUID.randomUUID().toString());
        account.setBalance(100000.0);
        account.setAdhaar(adhaaar);
        account.setPan(pan);
        SBIAccountDBService.accountMap.put(account.getAccount(), account);
        return account;
    }
}
