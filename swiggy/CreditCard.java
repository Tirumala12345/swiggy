package swiggy;

public class CreditCard {
    private double balance;

    public CreditCard(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void makePayment(double amount) throws CheckedException {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Payment of Rs:" + amount + " made using Credit Card. Remaining balance: Rs" + balance);
        } else {
            throw new CheckedException(ErrorCodes.INSUFFICIENT_BALANCE.getCode(),ErrorCodes.INSUFFICIENT_BALANCE.getMessage());
        }
    }
}
