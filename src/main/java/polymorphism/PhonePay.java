package polymorphism;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.BiPredicate;

public class PhonePay implements UPIPayment {

    public static Map<String,Double> accountBalanceMap = new HashMap<>();

    static {
        accountBalanceMap.put("9987875788",10000.0);
        accountBalanceMap.put("5646575675",50000.0);
    }

    BiPredicate<String,Double> balanceCheck = (accountNumber ,amt) -> {
        Double accountBalance = accountBalanceMap.get(accountNumber);
        if (accountBalance > amt) {
            return true;
        }else {
            return false;
        }
    };


        @Override
        public Payment transfer(String fromMobileNumber, String toMobileNumber, Double amoumt) {
          Payment p = new Payment();
            if (balanceCheck.test(fromMobileNumber,amoumt)) {

                Double fromAccountBalance  = accountBalanceMap.get(fromMobileNumber);
                Double toAccountBalance = accountBalanceMap.get(toMobileNumber);
                Double fromTotalBalance = fromAccountBalance-amoumt;
                Double toTotalBalance = toAccountBalance+amoumt;
                accountBalanceMap.put(fromMobileNumber,fromTotalBalance);
                accountBalanceMap.put(toMobileNumber,fromTotalBalance);
                p.setStatus(PaymentStatusEnum.SUCCESS.getLabel());
                p.setTransaction(UUID.randomUUID().toString());
                p.setUter(UUID.randomUUID().toString());
                p.setTransactionDate(new Date());
            }else {

                p.setStatus(PaymentStatusEnum.FAILED.getLabel());
                p.setTransaction(UUID.randomUUID().toString());
                p.setUter(UUID.randomUUID().toString());
                p.setTransactionDate(new Date());

            }

            return  p;
        }
    }
