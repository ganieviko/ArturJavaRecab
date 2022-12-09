package Day_29_StaticKeyword.task3;

public class BankAccount {
    String customerName;
    double customerBalance;
    public static double balance;

    public void deposit(double depositAmount){
        balance+= depositAmount;
         customerBalance += depositAmount;

    }

    public void withdraw(double withdrawAmount){
        balance -= withdrawAmount;
         customerBalance -= withdrawAmount;
    }

    public double balance(){
        return customerBalance;
    }
}
