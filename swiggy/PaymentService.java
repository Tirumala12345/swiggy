package swiggy;

import java.util.HashMap;
import java.util.Map;

public class PaymentService {
    private Map<String,Payment> paymentMethods;

    public PaymentService(){
        this.paymentMethods = new HashMap<>();
        paymentMethods.put("Phonepay", new PhonePay(10000));
        paymentMethods.put("CreditCard", new CreditCard(25000));
        paymentMethods.put("Cash", new CashOnDelivary());
    }
    public void paymentProcess(double amount,String paymentMethod){
        Payment payment= paymentMethods.get(paymentMethod);

        if(payment==null){
            System.out.println("Invalid Payment Method");
            return;
        }
        try{
            payment.paymentProcess(amount);
        }catch (CheckedException c){
            System.out.println(c.code+"      "+c.getMessage() );
        }
    }
}
