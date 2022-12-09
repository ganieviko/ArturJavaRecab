package Day_44_AbstractKeyword.task1;

import org.junit.Assert;
import org.junit.Test;

public class BankCardTest {
    @Test
    public void overDraftTest(){
        Credit credit = new Credit();
        credit.withdraw(100);
        double balance = credit.getBalance();
        Assert.assertEquals(-100, balance, 0.0);
    }
    @Test
    public void overDraftTest2(){
        Credit credit = new Credit();
        credit.deposit(50);
        credit.withdraw(200);
        double balance = credit.getBalance();
        Assert.assertEquals(-150, balance, 0.0);
    }
    @Test(expected = RuntimeException.class)
    public void overDraftTest3(){
        Debit debit = new Debit();
        debit.withdraw(100);
    }
    @Test
    public void depositTest(){
        Debit debit = new Debit();
        debit.deposit(100);
        double balance = debit.getBalance();
        Assert.assertEquals(100, balance, 0.0);
    }
}
