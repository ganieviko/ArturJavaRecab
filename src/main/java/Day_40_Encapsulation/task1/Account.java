package Day_40_Encapsulation.task1;

import java.util.Arrays;

public class Account {
    // instance variable
    // constructors
    // methods
    private String userId;
    private double balance;
    private String[] tags;

    public Account(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setBalance(double balance) {
        if (balance > 0){
            this.balance = balance;
        }
    }
    public double getBalance() {
        return balance;
    }

    public String[] getTags() {
        // if you want to make sure that tags cannot be changed by reference
//        return tags; // instead of returning the direct reference
        //  make a cope and then return copy
        String[] copy = Arrays.copyOf(tags, 1);
        return copy;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}
