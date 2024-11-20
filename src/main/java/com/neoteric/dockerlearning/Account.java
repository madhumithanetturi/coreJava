package com.neoteric.dockerlearning;

public class Account {

    public String holderName;
    public String bankName;



    public Account(){

    }

    public Account(String holderName) {
        this.holderName = holderName;
    }

    public Account(String holderName, String bankName) {
        this.holderName = holderName;
        this.bankName = bankName;
    }


}
