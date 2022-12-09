package Day_29_StaticKeyword.task3;

public class Task3 {

    public static void main(String[] args) {

        BankAccount bankAccountArtur = new BankAccount();
//        bankAccountArtur.customerBalance = 100000;
        bankAccountArtur.customerName = "Artur";

        BankAccount bankAccountAlbina = new BankAccount();
        bankAccountAlbina.customerName = "Albina";


        bankAccountAlbina.deposit(1000);
        bankAccountArtur.deposit(2000);
        bankAccountArtur.withdraw(500);
        bankAccountAlbina.withdraw(500);

        System.out.println(bankAccountAlbina.customerName + " has balance " + bankAccountAlbina.balance());
        System.out.println(bankAccountArtur.customerName + " has balance " +  bankAccountArtur.balance());

        System.out.println("Total balance from all accounts is: " + BankAccount.balance);
        System.out.println(bankAccountAlbina.customerBalance);
        System.out.println(bankAccountArtur.customerBalance);







    }
}
