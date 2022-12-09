package Day_44_AbstractKeyword.task1;

public abstract class BankCard {
    private double balance;

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    void deposit(double amount){
        if (amount < 0){
            throw new RuntimeException("Amount cannot be zero or negative");
        }
        balance += amount;
    }
    abstract void withdraw(double withdraw);
}
