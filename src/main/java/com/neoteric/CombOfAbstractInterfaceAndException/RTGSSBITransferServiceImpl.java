package com.neoteric.CombOfAbstractInterfaceAndException;

public class RTGSSBITransferServiceImpl extends  SBITransferService{
    @Override
    protected boolean transactionLimitCheck(Account account, Double amount) {

        System.out.println(" Validating transactionLimitCheck for account RTGSSBITransferServiceImpl"+account.getAccount());

        if (amount > 20000 && amount < 1000000)
            return true;
        else {
            return false;
        }

    }
}
