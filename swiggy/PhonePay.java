package swiggy;

public class PhonePay {
    private double balance;

    public PhonePay(double balance) {
        this.balance = balance;
    }

    public void makePayment(double amount) throws CheckedException {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Payment of Rs:" + amount + " made using PhonePe. Remaining balance: Rs" + balance);
        } else {
            throw new CheckedException(ErrorCodes.INSUFFICIENT_BALANCE.getCode(),ErrorCodes.INSUFFICIENT_BALANCE.getMessage());
        }
    }
}
