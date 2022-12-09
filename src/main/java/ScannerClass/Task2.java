package ScannerClass;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Create a splitter calculator
        // ask user for check total
        // ask user for number of friends
        // print the amount per friend to be separated

        Scanner splitterCalculator = new Scanner(System.in);
        System.out.println("Write total amount please");
        int totalAmount = splitterCalculator.nextInt();
        System.out.println("Write number of friends");
        byte amountOfFriends = splitterCalculator.nextByte();
        int sumPerFriend = totalAmount/amountOfFriends;
        System.out.println("The amount per friend is " + sumPerFriend);
    }
}
