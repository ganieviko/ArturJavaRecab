package Day_40_Encapsulation.task1;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Account account1 = new Account("Artur0013");
        account1.setBalance(15200.25);
        double account1Balance = account1.getBalance();
        System.out.println(account1.getUserId());
        System.out.println(account1Balance);
        String userId = account1.getUserId();
        userId = "changed";
        System.out.println(userId);
        System.out.println(account1.getUserId());

        Account account2 = new Account("Ruslan123");
        account2.setBalance(-100.56);
        double account2Balance = account2.getBalance();
        System.out.println(account2.getUserId());
        System.out.println(account2Balance);

        String [] array = {"tag1"};
        account1.setTags(array);

        System.out.println(Arrays.toString(account1.getTags()));
        String[] tags = account1.getTags();
        tags[0] = "changedTag";
        System.out.println(Arrays.toString(account1.getTags()));

        account1.setTags(tags); // proper way to change
        System.out.println(Arrays.toString(account1.getTags()));


    }
}
