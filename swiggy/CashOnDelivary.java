package swiggy;

public class CashOnDelivary implements Payment {


    @Override
    public void paymentProcess(double amount) {
        System.out.println("Payment of Rs:" + amount + " made using Cash.");
    }
}
