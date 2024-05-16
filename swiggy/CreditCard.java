package swiggy;

public class CreditCard implements Payment{
    private double balance;

    public CreditCard(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void paymentProcess(double amount) throws CheckedException {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Payment of Rs:" + amount + " made using Credit Card. Remaining balance: Rs" + balance);
        } else {
            throw new CheckedException(ErrorCodes.INSUFFICIENT_BALANCE.getCode(),ErrorCodes.INSUFFICIENT_BALANCE.getMessage());
        }
    }
}
