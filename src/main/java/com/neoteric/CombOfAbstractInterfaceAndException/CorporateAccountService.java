package com.neoteric.CombOfAbstractInterfaceAndException;

public interface CorporateAccountService extends AccountService{

    Account createAccount(String gst , String pan);
}
