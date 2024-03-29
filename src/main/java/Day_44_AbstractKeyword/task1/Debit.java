package Day_44_AbstractKeyword.task1;

public class Debit extends BankCard{
    @Override
    void withdraw(double amount) {
        if (amount < 0){
            throw new RuntimeException("Amount cannot be zero or negative");
        }
        if (getBalance() - amount < 0){
            throw new RuntimeException("Not enough balance");
        }
        setBalance(getBalance() - amount);
    }
}
