package com.neoteric.Exception;

public class ExceptionDemoTest {

    public static void main (String[] args){

        try {
            ExceptionTest test = new ExceptionTest();
            test.calculatewithfinnaly(20);

            System.out.println(" Ticket booking is done ");
        }catch (Exception e){

            System.out.println(((InsufficientBalanceException)e)+e.getMessage());
        }

        System.out.println(" I am done with the calculation ");
    }
}
