package ScannerClass;

import java.util.Scanner;

public class GetBoolean {
    public static void main(String[] args) {
        Scanner TrueOrFalse = new Scanner(System.in);
        System.out.println("Are you Pet Lovers?");
        boolean petPreference = TrueOrFalse.nextBoolean();
        System.out.println("My answer is " + petPreference);
    }
}
