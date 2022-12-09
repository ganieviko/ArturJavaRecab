package Day_44_AbstractKeyword.task1;

public class Credit extends BankCard{

    @Override
    void withdraw(double amount) {
        if (amount < 0){
            throw new RuntimeException("Amount cannot be zero or negative");
        }
        setBalance(getBalance() - amount);
    }
}
