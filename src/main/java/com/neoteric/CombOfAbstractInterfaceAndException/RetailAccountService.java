package com.neoteric.CombOfAbstractInterfaceAndException;

public interface RetailAccountService extends AccountService {

    Account createAccount(String adhaaar , String pan);
}
