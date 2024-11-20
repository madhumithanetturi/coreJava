package com.neoteric.Exception;

public class ExceptionTest {

    public void calculatewithfinnaly(int numberOfTickets) throws Exception{

        String status =null;

        try{
            System.out.println("Available"+PaymentService.seats);

            PaymentService.seats = PaymentService.seats-numberOfTickets;

            System.out.println("Available"+PaymentService.seats);

            PaymentService paymentService = new PaymentService();

            status= paymentService.payment(numberOfTickets);
        }finally {
            if (!"SUCCESS".equals(status)){
                PaymentService.seats=PaymentService.seats+numberOfTickets;
            }
            System.out.println(" from finally calculatewithfinally 123123");
            System.out.println(" from finnaly calculatewithfinally 234234");
            System.out.println(" from finally calculatewithfinally 345345");
            System.out.println("post payment Available"+PaymentService.seats);
        }

        System.out.println(" post finally block ");
    }
}
