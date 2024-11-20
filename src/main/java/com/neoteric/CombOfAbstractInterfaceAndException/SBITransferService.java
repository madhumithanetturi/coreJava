package com.neoteric.CombOfAbstractInterfaceAndException;

import com.neoteric.Exception.InsufficientBalanceException;
import com.neoteric.Exception.PaymentStatus;
import polymorphism.Payment;
import polymorphism.PaymentStatusEnum;

import java.util.Date;
import java.util.UUID;

public abstract class SBITransferService implements RBIPayment {


    /*  BiPredicate<String,Double> balanceCheck = (accountNumber, amt) -> {
       Account accountBalance = SBIAccountDBService.accountMap.get(accountNumber);
        if (accountBalance != null &&  accountBalance.getBalance() > amt){
            return  true;
        }else {
            return  false;
        }

    };*/

    public  Boolean balanceCheck(String accountNumber,Double amount){
        Account accountBalance = SBIAccountDBService.accountMap.get(accountNumber);
        if (accountBalance != null &&  accountBalance.getBalance() > amount){
            return  true;
        }else {
            return  false;
        }
    }

    // Abstract class can have concrete methods and abstract method

    // if class has a abstract method class must be a abstract \

    // if class marked as a abstract there is no rule to have a abstract method

//    Function<Double, Payment> errorSupplier = (amount) -> {
//        Payment p = new Payment();
//        p.setStatus(PaymentStatusEnum.FAILED.getLabel());
//        p.setTransaction(UUID.randomUUID().toString());
//        p.setUter(UUID.randomUUID().toString());
//        p.setTransactionDate(new Date());
//        p.setAmount(amount);
//        return  p;
//    };

    protected abstract boolean transactionLimitCheck(Account account, Double amount);

    @Override
    public  Payment transfer(String fromAccount, String toAccount, Double amount) throws InsufficientBalanceException {
        Payment p = new Payment();
        // balance check
        if (this.balanceCheck(fromAccount, amount)) {
            Account account = SBIAccountDBService.accountMap.get(fromAccount);
            // transaction limit
            if (this.transactionLimitCheck(account, amount)) {
                p.setStatus(PaymentStatusEnum.SUCCESS.getLabel());
                p.setTransaction(UUID.randomUUID().toString());
                p.setUter(UUID.randomUUID().toString());
                p.setTransactionDate(new Date());
                p.setAmount(amount);

            }
        } else {
            throw new InsufficientBalanceException
                    (PaymentStatus.INSUFFICIENT_BALANCE.getCode(), PaymentStatus.INSUFFICIENT_BALANCE.getLabel());

        }
        return p;

    }

}
