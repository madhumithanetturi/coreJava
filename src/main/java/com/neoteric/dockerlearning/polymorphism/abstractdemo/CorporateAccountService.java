package com.neoteric.dockerlearning.polymorphism.abstractdemo;

public interface CorporateAccountService extends AccountService{

    Account createAccount(String gst, String pan);

}
