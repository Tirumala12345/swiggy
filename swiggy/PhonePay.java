package swiggy;

public class PhonePay implements Payment {
    private double balance;

    public PhonePay(double balance) {
        this.balance = balance;
    }

    @Override
    public void paymentProcess(double amount) throws CheckedException {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Payment of Rs:" + amount + " made using PhonePe. Remaining balance: Rs" + balance);
        } else {
            throw new CheckedException(ErrorCodes.INSUFFICIENT_BALANCE.getCode(),ErrorCodes.INSUFFICIENT_BALANCE.getMessage());
        }
    }
}
