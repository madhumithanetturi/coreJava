package com.neoteric.CombOfAbstractInterfaceAndException;

public class NEFTSBITransferServiceImpl extends SBITransferService {

    @Override
    protected boolean transactionLimitCheck(Account account, Double amount) {

        System.out.println("Validating transactionLimitCheck for account in NEFTSBITransferServiceImpl"+account.getAccount());

        if (amount < 100000)
            return true;
        else {
            return false;
        }
    }

}
