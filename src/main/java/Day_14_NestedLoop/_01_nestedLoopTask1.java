package Day_14_NestedLoop;

import java.util.Scanner;

public class _01_nestedLoopTask1 {
    // Write a program that prompts user for an integer between 0-100.
    // keep asking until you get the correct integer between 0-100.

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int inputFromUser;
        do {
            System.out.println("Please write input between 0 and 100");
            inputFromUser = scanner.nextInt();
        } while (inputFromUser < 0 || inputFromUser > 100); // keep asking if the number is less than 0 or larger than 100
        System.out.println("You wrote the correct input");
    }
}

