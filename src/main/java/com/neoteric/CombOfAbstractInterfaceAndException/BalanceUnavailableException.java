package com.neoteric.CombOfAbstractInterfaceAndException;

public class BalanceUnavailableException extends RuntimeException {

    private String code;

    public BalanceUnavailableException(String code , String message) {
        super(message);
        this.code=code;
    }
}
