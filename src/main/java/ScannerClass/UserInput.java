package ScannerClass;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please write your first name");
        String name = userInput.nextLine();
        System.out.println(name);
    }
}
