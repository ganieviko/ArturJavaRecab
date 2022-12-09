package Day_40_Encapsulation.task2;

public class BankAccount {
    private String userId; // read only
    private double balance; // read only
    private Currency currency; // read only

    public BankAccount(String userId, Currency currency) {
        this.userId = userId;
        this.currency = currency;
    }

    public String getUserId() {
        return userId;
    }

    public double getBalance() {
        return balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("The amount should be greater than zero!");
        }
        balance += amount;
    }

    public void withdraw(double amount){
        if (amount <=0){
            throw new IllegalArgumentException("The amount should be greater than zero!");
        }
        if (balance - amount < 0){
            throw new IllegalArgumentException("Not enough to withdraw, transaction denied!");
        }
        balance -=amount;
    }
}
