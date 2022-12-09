package Day_40_Encapsulation.task2;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {
    @Test(expected = IllegalArgumentException.class)
    public void withdraw1(){
        // try to withdraw 100 with 0 balance
        BankAccount account = new BankAccount("1", Currency.USD);
        account.withdraw(100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdraw2(){
        // try to withdraw -100 with 0 balance
        BankAccount account = new BankAccount("1", Currency.USD);
        account.withdraw(-100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdraw3(){
        // try to withdraw 0 with 0 balance
        BankAccount account = new BankAccount("1", Currency.USD);
        account.withdraw(0);
    }

    @Test
    public void withdraw4(){
        // try to withdraw 50 with 100 balance
        BankAccount account = new BankAccount("1", Currency.USD);
        account.deposit(100);
        account.withdraw(50);
        double actual = account.getBalance();
        Assert.assertEquals(50.0, actual, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdraw5(){
        // try to withdraw 150 with 100 balance
        BankAccount account = new BankAccount("1", Currency.USD);
        account.deposit(100);
        account.withdraw(150);

    }

    @Test
    public void withdraw6(){
        // try to withdraw 100 with 100 balance
        BankAccount account = new BankAccount("1", Currency.USD);
        account.deposit(100);
        account.withdraw(100);
        double actual = account.getBalance();
        Assert.assertEquals(0, actual, 0.0);
    }

    @Test
    public void deposit1(){
        // try to deposit 100 with 0 balance
        BankAccount account = new BankAccount("1", Currency.USD);
        account.deposit(100);
        double actual = account.getBalance();
        Assert.assertEquals(100, actual, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deposit2(){
        // try to deposit -100 with 0 balance
        BankAccount account = new BankAccount("1", Currency.USD);
        account.deposit(-100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deposit3(){
        // try to deposit 0 with 0 balance
        BankAccount account = new BankAccount("1", Currency.USD);
        account.deposit(0);
    }

    @Test
    public void deposit4(){
        // try to deposit 50 with 50 balance
        BankAccount account = new BankAccount("1", Currency.USD);
        account.deposit(50);
        account.deposit(50);
        double actual = account.getBalance();
        Assert.assertEquals(100, actual, 0.0);
    }

    @Test
    public void deposit5(){
        // try to deposit 50 with max balance
        BankAccount account = new BankAccount("1", Currency.USD);
        account.deposit(Double.MAX_VALUE);
        account.deposit(50);
        double actual = account.getBalance();
        Assert.assertEquals(Double.MAX_VALUE + 50, actual, 0.0);
    }
}
