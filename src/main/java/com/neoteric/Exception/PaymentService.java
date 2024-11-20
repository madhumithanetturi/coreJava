package com.neoteric.Exception;

import polymorphism.PaymentStatusEnum;

public class PaymentService {

    static int seats = 40;

    public String payment(int numberOfTickets) throws InsufficientBalanceException{

        try{
            if (numberOfTickets > 25){
                throw new InsufficientBalanceException(PaymentStatus.INSUFFICIENT_BALANCE.getCode() , PaymentStatus.INSUFFICIENT_BALANCE.getLabel());

            }
        }catch (InsufficientBalanceException e){
            System.out.println("Exception InsufficientBalanceException ocuured"+e);
            throw e;
        }catch (Exception e){
            System.out.println("Exception occured"+e);
            throw e ;
        }
        return "SUCCESS";
    }
}
