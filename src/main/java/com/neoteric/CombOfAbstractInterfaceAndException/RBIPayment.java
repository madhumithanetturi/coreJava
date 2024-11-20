package com.neoteric.CombOfAbstractInterfaceAndException;

import com.neoteric.Exception.InsufficientBalanceException;
import polymorphism.Payment;

public interface RBIPayment {

    Payment transfer(String fromAccount , String toAccount , Double amount) throws InsufficientBalanceException;
}
