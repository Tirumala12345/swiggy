package swiggy;

import java.util.HashMap;
import java.util.Map;

public class PaymentService {
    private final Map<String, Payment> paymentMethods;

    public PaymentService() {
        this.paymentMethods = new HashMap<>();
        paymentMethods.put("PhonePe", new PhonePay(10000));
        paymentMethods.put("CreditCard", new CreditCard(25000));
        paymentMethods.put("Cash", new CashOnDelivery());
    }

    public void paymentProcess(double amount, String paymentMethod) {
        Payment payment = paymentMethods.get(paymentMethod);

        if (payment == null) {
            System.out.println("Invalid Payment Method");
            return;
        }
        try {
            payment.paymentProcess(amount);
        } catch (CheckedException e) {
            System.out.println(e.getCode() + " " + e.getMessage());
        }
    }
}
