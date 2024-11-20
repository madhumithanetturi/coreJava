package polymorphism;

public class InterfaceTest {

    public static void main (String[] args) {
        UPIPayment payments = new PhonePay();

        Payment pay = payments.transfer("9987875788","5646575675",30.0);

        System.out.println(pay.getTransaction()+" status "+pay.getStatus()+" uter "+pay.getUter()+"Date"+pay.getTransactionDate());

        System.out.println(" Balance of from account "+PhonePay.accountBalanceMap.get("9987875788"));

        System.out.println(" Balance of to account "+PhonePay.accountBalanceMap.get("5646575675"));


    }
}
