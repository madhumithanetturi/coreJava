package com.neoteric.CombOfAbstractInterfaceAndException;

import com.neoteric.Exception.InsufficientBalanceException;


public class BankTest {

    public static void main(String[] args) throws InsufficientBalanceException {

        RetailAccountServiceImpl retailAccountService = new RetailAccountServiceImpl();

        Account a = retailAccountService.createAccount("1243","325236");
        SBITransferService nefttransferservice=new NEFTSBITransferServiceImpl();
        try{
            nefttransferservice.transfer(a.getAccount(), "1234",1000.0);
            System.out.println("transfer successfull");

        }catch (InsufficientBalanceException e){
            System.out.println("transfer failed"+e.getMessage());
        }
        SBITransferService RTGSSBITransfer = new RTGSSBITransferServiceImpl();
        try{
            RTGSSBITransfer.transfer(a.getAccount(), "1234",10000.0);

        }catch (BalanceUnavailableException | InsufficientBalanceException e){
            throw new RuntimeException(" insufficeientbalance in rtgs account");
        }finally {
            System.out.println(" from finally ");
        }



    }
}
